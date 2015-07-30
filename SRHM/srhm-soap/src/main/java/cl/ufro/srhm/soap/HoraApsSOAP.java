package cl.ufro.srhm.soap;

import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.orm.PersistentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import cl.ufro.srhm.openmrs.OpenmrsHttpClient;
import cl.ufro.srhm.openmrs.UnirestHttpClient;
import cl.ufro.srhm.orm.HoraMedica;
import cl.ufro.srhm.orm.HoraMedicaCriteria;
import cl.ufro.srhm.orm.HoraMedicaDAO;
import cl.ufro.srhm.orm.Paciente;
import cl.ufro.srhm.orm.PacienteDAO;
import cl.ufro.srhm.orm.Reserva;
import cl.ufro.srhm.orm.ReservaDAO;
import cl.ufro.srhm.soap.vo.HoraMedicaVO;
import cl.ufro.srhm.soap.vo.ReservaVO;

public class HoraApsSOAP {

	private static final Logger _logger = LoggerFactory.getLogger(HoraApsSOAP.class);

	public String buscarHoraAPS(int medicoId, Date fecha1, Date fecha2) {

		String resultado = "";

		try {
			HoraMedicaCriteria horaMedicaCriteria = new HoraMedicaCriteria();
			horaMedicaCriteria.medicoId.eq(medicoId);
			horaMedicaCriteria.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));
			horaMedicaCriteria.reservas.isEmpty();

			List<HoraMedica> horasMedicas = horaMedicaCriteria.list();

			List<HoraMedicaVO> horasMedicasVO = new LinkedList<>();

			for (HoraMedica horaMedica : horasMedicas) {
				horasMedicasVO.add(HoraMedicaVO.fromHoraMedica(horaMedica));
			}

			Gson gson = new Gson();
			resultado = gson.toJson(horasMedicasVO);

		} catch (PersistentException e) {
			_logger.error("", e);
		}
		return resultado;
	}

	public String reservarHoraAps(int horaMedicaId, int pacienteId) {
		String resultado = "{}";

		try {
			HoraMedica horaMedica = HoraMedicaDAO.getHoraMedicaByORMID(horaMedicaId);
			Paciente paciente = PacienteDAO.getPacienteByORMID(pacienteId);

			if (horaMedica == null || paciente == null) {
				return "{msg: Parametros invalidos}";
			}

			if (!horaMedica.reservas.isEmpty()) {
				return "{msg: La hora ya se encuentra reservada}";
			}

			Reserva reserva = new Reserva();
			reserva.setPaciente(paciente);
			reserva.setPersona(paciente.getUsuario());
			reserva.reservaHoraMedica.add(horaMedica);

			ReservaDAO.save(reserva);
			resultado = new Gson().toJson(ReservaVO.fromReserva(reserva));

		} catch (PersistentException e) {
			_logger.error("", e);
		}

		return resultado;
	}

	public String reservarHoraMedicaControl(int[] horasMedicasIds, int pacienteId) {
		String resultado = "";
		try {
			Paciente paciente = PacienteDAO.getPacienteByORMID(pacienteId);

			if (paciente == null) {
				return "msg: Paciente no encontrado";
			}

			Reserva reserva = new Reserva();
			reserva.setPaciente(paciente);

			for (int i : horasMedicasIds) {
				HoraMedica horaMedica = HoraMedicaDAO.getHoraMedicaByORMID(i);
				if (horaMedica == null) {
					return String.format("{hora medica no encontrada ID = %s}", i);
				} else if (!horaMedica.reservas.isEmpty()) {
					return String.format("{hora medica ya se encuentra reservada ID = %s}", i);
				}

				if (reserva.getPersona() == null) {
					reserva.setPersona(horaMedica.getMedico().getUsuario());

				}

				reserva.reservaHoraMedica.add(horaMedica);
			}

			ReservaDAO.save(reserva);

		} catch (PersistentException e) {
			_logger.error("", e);
		}

		return resultado;
	}
	
	public String buscarHorasMedicasPaciente(String id) {
		OpenmrsHttpClient openmrsHttpClient = new UnirestHttpClient();
		return openmrsHttpClient.getEncounters(id);
	}
}
