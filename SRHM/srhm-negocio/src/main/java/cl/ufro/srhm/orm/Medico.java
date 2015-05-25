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
@Table(name="medicos")
public class Medico implements Serializable {
	public Medico() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == cl.ufro.srhm.orm.ORMConstants.KEY_MEDICO_HORAMEDICA) {
			return ORM_horaMedica;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="CL_UFRO_SRHM_ORM_MEDICO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CL_UFRO_SRHM_ORM_MEDICO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(targetEntity=cl.ufro.srhm.orm.Persona.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="usuario_id", referencedColumnName="id", nullable=false) })	
	private cl.ufro.srhm.orm.Persona usuario;
	
	@OneToOne(targetEntity=cl.ufro.srhm.orm.Especialidad.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="especialidad_id", referencedColumnName="id", nullable=false) })	
	private cl.ufro.srhm.orm.Especialidad especialidad;
	
	@OneToMany(mappedBy="medico", targetEntity=cl.ufro.srhm.orm.HoraMedica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_horaMedica = new java.util.HashSet();
	
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
				usuario.setMedico(this);
			}
			if (lusuario != null) {
				lusuario.setMedico(null);
			}
		}
	}
	
	public cl.ufro.srhm.orm.Persona getUsuario() {
		return usuario;
	}
	
	public void setEspecialidad(cl.ufro.srhm.orm.Especialidad value) {
		if (this.especialidad != value) {
			cl.ufro.srhm.orm.Especialidad lespecialidad = this.especialidad;
			this.especialidad = value;
			if (value != null) {
				especialidad.setMedico(this);
			}
			if (lespecialidad != null) {
				lespecialidad.setMedico(null);
			}
		}
	}
	
	public cl.ufro.srhm.orm.Especialidad getEspecialidad() {
		return especialidad;
	}
	
	private void setORM_HoraMedica(java.util.Set value) {
		this.ORM_horaMedica = value;
	}
	
	private java.util.Set getORM_HoraMedica() {
		return ORM_horaMedica;
	}
	
	@Transient	
	public final cl.ufro.srhm.orm.HoraMedicaSetCollection horaMedica = new cl.ufro.srhm.orm.HoraMedicaSetCollection(this, _ormAdapter, cl.ufro.srhm.orm.ORMConstants.KEY_MEDICO_HORAMEDICA, cl.ufro.srhm.orm.ORMConstants.KEY_HORAMEDICA_MEDICO, cl.ufro.srhm.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
