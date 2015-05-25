/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package cl.ufro.srhm.orm;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="especialidades")
public class Especialidad implements Serializable {
	public Especialidad() {
	}
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="CL_UFRO_SRHM_ORM_ESPECIALIDAD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CL_UFRO_SRHM_ORM_ESPECIALIDAD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="nombre", nullable=true, length=180)	
	private String nombre;
	
	@OneToOne(mappedBy="especialidad", targetEntity=cl.ufro.srhm.orm.Medico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private cl.ufro.srhm.orm.Medico medico;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setMedico(cl.ufro.srhm.orm.Medico value) {
		if (this.medico != value) {
			cl.ufro.srhm.orm.Medico lmedico = this.medico;
			this.medico = value;
			if (value != null) {
				medico.setEspecialidad(this);
			}
			if (lmedico != null) {
				lmedico.setEspecialidad(null);
			}
		}
	}
	
	public cl.ufro.srhm.orm.Medico getMedico() {
		return medico;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
