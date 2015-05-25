package cl.ufro.srhm.soap.vo;

public class EspecialidadVO {
	
	private int id;
	private String nombre;
	
	public EspecialidadVO() {
	}
	
	public EspecialidadVO(int id, String nombre) {
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
	
	public static EspecialidadVO fromEspecialidad(cl.ufro.srhm.orm.Especialidad especialidad) {
		return new EspecialidadVO(especialidad.getId(), especialidad.getNombre());
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
