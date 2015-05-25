package cl.ufro.srhm.soap.vo;

import java.util.Date;

import cl.ufro.srhm.orm.HoraMedica;

public class HoraMedicaVO {
	private int id;
	private int medico_id;
	private String medicoNombre;
	private int box_id;
	private String boxDescripcion;
	private Date fecha;

	public HoraMedicaVO() {
	}

	public HoraMedicaVO(int id, int medico_id, String medicoNombre, int box_id, String boxDescripcion, Date fecha) {
		super();
		this.id = id;
		this.medico_id = medico_id;
		this.medicoNombre = medicoNombre;
		this.box_id = box_id;
		this.boxDescripcion = boxDescripcion;
		this.fecha = fecha;
	}

	public String getMedicoNombre() {
		return medicoNombre;
	}

	public void setMedicoNombre(String medicoNombre) {
		this.medicoNombre = medicoNombre;
	}

	public String getBoxDescripcion() {
		return boxDescripcion;
	}

	public void setBoxDescripcion(String boxDescripcion) {
		this.boxDescripcion = boxDescripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMedico_id() {
		return medico_id;
	}

	public void setMedico_id(int medico_id) {
		this.medico_id = medico_id;
	}

	public int getBox_id() {
		return box_id;
	}

	public void setBox_id(int box_id) {
		this.box_id = box_id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public static HoraMedicaVO fromHoraMedica(HoraMedica horaMedica) {
		return new HoraMedicaVO(horaMedica.getId(), horaMedica.getMedico().getId(),
				horaMedica.getMedico().getUsuario().getNombre(), horaMedica.getBox().getId(),
				horaMedica.getBox().getDescripcion(), horaMedica.getFecha());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id=");
		builder.append(id);
		builder.append(", medico_id=");
		builder.append(medico_id);
		builder.append(", medicoNombre=");
		builder.append(medicoNombre);
		builder.append(", box_id=");
		builder.append(box_id);
		builder.append(", boxDescripcion=");
		builder.append(boxDescripcion);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append("}");
		return builder.toString();
	}
}
