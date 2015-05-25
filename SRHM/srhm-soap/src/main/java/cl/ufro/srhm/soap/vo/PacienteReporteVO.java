package cl.ufro.srhm.soap.vo;

import cl.ufro.srhm.orm.Paciente;

public class PacienteReporteVO implements Comparable<PacienteReporteVO> {
	private int id;
	private String nombre;
	private Integer uso;
	
	public PacienteReporteVO(int id, String nombre, Integer uso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.uso = uso;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static PacienteReporteVO fromPaciente(Paciente paciente, int uso) {
		return new PacienteReporteVO(paciente.getId(), paciente.getUsuario().getNombre(), uso);
	}

	public Integer getUso() {
		return uso;
	}

	public void setUso(Integer uso) {
		this.uso = uso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", uso=");
		builder.append(uso);
		builder.append("}");
		return builder.toString();
	}

	@Override
	public int compareTo(PacienteReporteVO o) {
		return o.uso.compareTo(uso);
	}
	
	
}
