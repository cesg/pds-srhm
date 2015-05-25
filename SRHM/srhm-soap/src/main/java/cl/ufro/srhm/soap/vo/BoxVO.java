package cl.ufro.srhm.soap.vo;

import cl.ufro.srhm.orm.Box;

public class BoxVO {
	
	private int id;
	private String descripcion;
	
	public BoxVO() {
	}

	public BoxVO(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static BoxVO fromBox(Box box) {
		return new BoxVO(box.getId(), box.getDescripcion());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("}");
		return builder.toString();
	}
	
	
}
