package cl.ufro.srhm.soap;

import cl.ufro.srhm.openmrs.OpenmrsHttpClient;
import cl.ufro.srhm.openmrs.UnirestHttpClient;
import cl.ufro.srhm.orm.*;
import cl.ufro.srhm.soap.vo.PacienteReporteVO;
import cl.ufro.srhm.soap.vo.PacienteVO;
import com.google.gson.Gson;
import org.hibernate.criterion.Projections;
import org.orm.PersistentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class PacienteSOAP {
    private static final Logger _logger = LoggerFactory.getLogger(PacienteSOAP.class);

    public String obtenerPacientes() {
        String resultado = "[]";
        try {
            List<Paciente> pacientes = PacienteDAO.queryPaciente(null, null);
            List<PacienteVO> pacientesVO = new LinkedList<>();

            for (Paciente paciente : pacientes) {
                pacientesVO.add(PacienteVO.fromPaciente(paciente));
            }
            resultado = new Gson().toJson(pacientesVO);
        } catch (PersistentException e) {
            _logger.error("", e);
        }
        return resultado;
    }

    public String obtenerPacientesMasReservas(Date fecha1, Date fecha2) {
        String resultado = "{}";
        List<PacienteReporteVO> estadistica = new LinkedList<PacienteReporteVO>();

        try {

            PacienteCriteria pacienteCta = new PacienteCriteria();
            pacienteCta
                    .setProjection(Projections.projectionList().add(Projections.distinct(Projections.property("id"))));
            ReservaCriteria reservaCta = pacienteCta.createReservaCriteria();

            HoraMedicaCriteria horaMedicaCta = reservaCta.createReservaHoraMedicaCriteria();
            horaMedicaCta.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));

            List<Integer> pacientesIds = pacienteCta.list();

            ReservaCriteria rc = new ReservaCriteria();

            HoraMedicaCriteria hmc = rc.createReservaHoraMedicaCriteria();
            hmc.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));

            int reservasAFecha = rc.list().size();

            for (Integer pacienteId : pacientesIds) {

                ReservaCriteria rcPaciente = new ReservaCriteria();
                rcPaciente.pacienteId.eq(pacienteId);

                HoraMedicaCriteria hmcP = rcPaciente.createReservaHoraMedicaCriteria();
                hmcP.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));

                int reservasPaciente = rcPaciente.list().size();

                Paciente paciente = PacienteDAO.getPacienteByORMID(pacienteId);

                estadistica.add(PacienteReporteVO.fromPaciente(paciente,
                        (reservasAFecha == 0) ? 0 : reservasPaciente * 100 / reservasAFecha));
            }
        } catch (PersistentException e) {

        }
        Collections.sort(estadistica);
        resultado = new Gson().toJson(estadistica);

        return resultado;
    }

    public String bucarPaciente(String query) {
        OpenmrsHttpClient openmrsHttpClient = new UnirestHttpClient();
        return openmrsHttpClient.getPacientes(query);
    }
}
