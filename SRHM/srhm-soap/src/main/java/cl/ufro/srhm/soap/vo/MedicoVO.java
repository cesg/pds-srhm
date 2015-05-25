package cl.ufro.srhm.soap.vo;

public class MedicoVO {
	private int id;
	private String nombre;
	
	public MedicoVO() {
	}

	public MedicoVO(int id, String nombre) {
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

	public static MedicoVO fromMedico(cl.ufro.srhm.orm.Medico medico) {
		return new MedicoVO(medico.getId(), medico.getUsuario().getNombre());
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
