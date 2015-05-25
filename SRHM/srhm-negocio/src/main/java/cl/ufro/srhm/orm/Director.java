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
@Table(name="directores")
public class Director implements Serializable {
	public Director() {
	}
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="CL_UFRO_SRHM_ORM_DIRECTOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CL_UFRO_SRHM_ORM_DIRECTOR_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(targetEntity=cl.ufro.srhm.orm.Persona.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="usuario_id", referencedColumnName="id", nullable=false) })	
	private cl.ufro.srhm.orm.Persona usuario;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setUsuario(cl.ufro.srhm.orm.Persona value) {
		if (this.usuario != value) {
			cl.ufro.srhm.orm.Persona lusuario = this.usuario;
			this.usuario = value;
			if (value != null) {
				usuario.setDirector(this);
			}
			if (lusuario != null) {
				lusuario.setDirector(null);
			}
		}
	}
	
	public cl.ufro.srhm.orm.Persona getUsuario() {
		return usuario;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
