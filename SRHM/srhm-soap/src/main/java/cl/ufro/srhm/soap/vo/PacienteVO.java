package cl.ufro.srhm.soap.vo;

import cl.ufro.srhm.orm.Paciente;

public class PacienteVO {
	private int id;
	private String nombre;
	
	public PacienteVO() {
	}
	
	public PacienteVO(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public static PacienteVO fromPaciente(Paciente paciente) {
		return new PacienteVO(paciente.getId(), paciente.getUsuario().getNombre());
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("}");
		return builder.toString();
	}
}
