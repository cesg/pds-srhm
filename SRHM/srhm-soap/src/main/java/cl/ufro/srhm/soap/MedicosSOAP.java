package cl.ufro.srhm.soap;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.criterion.Projections;
import org.orm.PersistentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import cl.ufro.srhm.orm.HoraMedica;
import cl.ufro.srhm.orm.HoraMedicaCriteria;
import cl.ufro.srhm.orm.Medico;
import cl.ufro.srhm.orm.MedicoCriteria;
import cl.ufro.srhm.orm.MedicoDAO;
import cl.ufro.srhm.orm.ReservaCriteria;
import cl.ufro.srhm.soap.vo.HoraMedicaVO;
import cl.ufro.srhm.soap.vo.MedicoReporteVO;
import cl.ufro.srhm.soap.vo.MedicoVO;

public class MedicosSOAP {

	private static final Logger _logger = LoggerFactory.getLogger(MedicosSOAP.class);

	public String obtenerMedicosDeEspecialidad(int especialidadId) {
		String resultado = "[]";

		try {
			@SuppressWarnings("unchecked")
			List<Medico> medicos = MedicoDAO.queryMedico("especialidad_id = " + especialidadId, null);

			List<MedicoVO> medicosVO = new LinkedList<>();

			for (Medico medico : medicos) {
				medicosVO.add(MedicoVO.fromMedico(medico));
			}
			Gson gson = new Gson();
			resultado = gson.toJson(medicosVO);

		} catch (PersistentException e) {
			_logger.error("", e);
		}
		return resultado;
	}

	public String obtenerMedico(int id) {
		String resultado = "{}";
		try {
			Medico medico = MedicoDAO.getMedicoByORMID(id);
			Gson gson = new Gson();
			resultado = gson.toJson(MedicoVO.fromMedico(medico));
		} catch (PersistentException e) {
			_logger.error("", e);
		}

		return resultado;
	}

	public int obtenerOcupacionMedico(int medicoId, Date fecha1, Date fecha2) {
		int resultado = 0;

		try {
			Medico medico = MedicoDAO.getMedicoByORMID(medicoId);

			ReservaCriteria reservaCriteria = new ReservaCriteria();
			HoraMedicaCriteria horaMedicaCriteria = reservaCriteria.createReservaHoraMedicaCriteria();
			horaMedicaCriteria.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));

			int totalReservas = reservaCriteria.list().size();

			MedicoCriteria medicoCriteria = horaMedicaCriteria.createMedicoCriteria();
			medicoCriteria.id.eq(medicoId);

			int reservasMedico = reservaCriteria.list().size();

			return (totalReservas != 0) ? reservasMedico * 100 / totalReservas : 0;

		} catch (PersistentException e) {
			_logger.error("", e);
		}

		return resultado;
	}

	public String obtenerMedicoMasSolicitado(Date fecha1, Date fecha2) {
		String resultado = "[]";
		List<MedicoReporteVO> reporteMedicos = new LinkedList<>();
		
		try {
			ReservaCriteria reservaCriteria = new ReservaCriteria();
			HoraMedicaCriteria horaMedicaCriteria = reservaCriteria.createReservaHoraMedicaCriteria();
			horaMedicaCriteria.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));
			
			int totalReservas = reservaCriteria.list().size();
			
			MedicoCriteria criteria = new MedicoCriteria();
			criteria.setProjection(Projections.property("id"));
			
			List<Integer> medicosId = criteria.list();
			
			for (Integer id: medicosId) {

				ReservaCriteria reservaCriteria2 = new ReservaCriteria();
				HoraMedicaCriteria horaMedicaCriteria2 = reservaCriteria2.createReservaHoraMedicaCriteria();
				horaMedicaCriteria.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));
				
				MedicoCriteria medicoCriteria = horaMedicaCriteria2.createMedicoCriteria();
				medicoCriteria.id.eq(id);
				
				int reservasMedico = reservaCriteria2.list().size();
				
				Medico medico = MedicoDAO.getMedicoByORMID(id);

				reporteMedicos.add(MedicoReporteVO.fromMedico(medico, (totalReservas != 0) ? reservasMedico * 100/totalReservas : 0));
			}
		} catch (PersistentException e) {
			_logger.error("", e);
		}

		Collections.sort(reporteMedicos);
		resultado = new Gson().toJson(reporteMedicos);
		return resultado;
	}
	
	public String buscarSuDisponibilidad(int medicoId, Date fecha1, Date fecha2) {
		String resultado = "";

		try {
			HoraMedicaCriteria horaMedicaCriteria = new HoraMedicaCriteria();
			horaMedicaCriteria.medicoId.eq(medicoId);
			horaMedicaCriteria.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));
			horaMedicaCriteria.reservas.isEmpty();
			horaMedicaCriteria.setCacheable(false);
			
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
}
