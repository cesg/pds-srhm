package cl.ufro.srhm.soap.vo;

public class MedicoReporteVO implements Comparable<MedicoReporteVO> {
	private int id;
	private String nombre;
	private Integer ocupacion;
	

	public MedicoReporteVO(int id, String nombre, int ocupacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ocupacion = ocupacion;
	}

	public int getOcupacion() {
		return ocupacion;
	}


	public void setOcupacion(int ocupacion) {
		this.ocupacion = ocupacion;
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

	public static MedicoReporteVO fromMedico(cl.ufro.srhm.orm.Medico medico , int ocupacion) {
		return new MedicoReporteVO(medico.getId(), medico.getUsuario().getNombre(), ocupacion);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", ocupacion=");
		builder.append(ocupacion);
		builder.append("}");
		return builder.toString();
	}


	@Override
	public int compareTo(MedicoReporteVO o) {
		return o.ocupacion.compareTo(ocupacion);
//		int resultado = 0;
//		if(this.ocupacion > o.getOcupacion()) {
//			resultado = -1;
//		}else if(this.ocupacion < o.getOcupacion()) {
//			resultado = 1;
//		}
//		return resultado;
	}
}
