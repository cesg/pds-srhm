package cl.ufro.srhm.soap.vo;

import java.util.Set;

import cl.ufro.srhm.orm.Reserva;

public class ReservaVO {
	
	private int id;
	private int pacienteId;
	private int personaId;
	
	private Set<HoraMedicaVO> horasMedicas;
	
	public ReservaVO() {
	}

	public ReservaVO(int id, int pacienteId, int personaId, Set<HoraMedicaVO> horasMedicas) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.personaId = personaId;
		this.horasMedicas = horasMedicas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}

	public int getPersonaId() {
		return personaId;
	}

	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}

	public Set<HoraMedicaVO> getHorasMedicas() {
		return horasMedicas;
	}

	public void setHorasMedicas(Set<HoraMedicaVO> horasMedicas) {
		this.horasMedicas = horasMedicas;
	}
	
	public static ReservaVO fromReserva(Reserva reserva) {
		ReservaVO reservaVO = new ReservaVO();
		reservaVO.setId(reserva.getId());
		reservaVO.setPacienteId(reserva.getPaciente().getId());
		reservaVO.setPersonaId(reserva.getPersona().getId());
//		reservaVO.setHorasMedicas(reserva.reservaHoraMedica.getCollection());
		return reservaVO;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id=");
		builder.append(id);
		builder.append(", pacienteId=");
		builder.append(pacienteId);
		builder.append(", personaId=");
		builder.append(personaId);
		builder.append(", horasMedicas=");
		builder.append(horasMedicas);
		builder.append("}");
		return builder.toString();
	}
	
	
}
