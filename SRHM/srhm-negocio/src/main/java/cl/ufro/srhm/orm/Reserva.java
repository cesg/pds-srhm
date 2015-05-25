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
@Table(name="reservas")
public class Reserva implements Serializable {
	public Reserva() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == cl.ufro.srhm.orm.ORMConstants.KEY_RESERVA_RESERVAHORAMEDICA) {
			return ORM_reservaHoraMedica;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == cl.ufro.srhm.orm.ORMConstants.KEY_RESERVA_PACIENTE) {
			this.paciente = (cl.ufro.srhm.orm.Paciente) owner;
		}
		
		else if (key == cl.ufro.srhm.orm.ORMConstants.KEY_RESERVA_PERSONA) {
			this.persona = (cl.ufro.srhm.orm.Persona) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="CL_UFRO_SRHM_ORM_RESERVA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CL_UFRO_SRHM_ORM_RESERVA_ID_GENERATOR", strategy="identity")	
	private int id;
	
	@ManyToOne(targetEntity=cl.ufro.srhm.orm.Paciente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="paciente_id", referencedColumnName="id", nullable=false) })	
	private cl.ufro.srhm.orm.Paciente paciente;
	
	@ManyToOne(targetEntity=cl.ufro.srhm.orm.Persona.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="persona_id", referencedColumnName="id", nullable=false) })	
	private cl.ufro.srhm.orm.Persona persona;
	
	@ManyToMany(mappedBy="ORM_reservas", targetEntity=cl.ufro.srhm.orm.HoraMedica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reservaHoraMedica = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPaciente(cl.ufro.srhm.orm.Paciente value) {
		if (paciente != null) {
			paciente.reserva.remove(this);
		}
		if (value != null) {
			value.reserva.add(this);
		}
	}
	
	public cl.ufro.srhm.orm.Paciente getPaciente() {
		return paciente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Paciente(cl.ufro.srhm.orm.Paciente value) {
		this.paciente = value;
	}
	
	private cl.ufro.srhm.orm.Paciente getORM_Paciente() {
		return paciente;
	}
	
	public void setPersona(cl.ufro.srhm.orm.Persona value) {
		if (persona != null) {
			persona.reserva.remove(this);
		}
		if (value != null) {
			value.reserva.add(this);
		}
	}
	
	public cl.ufro.srhm.orm.Persona getPersona() {
		return persona;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Persona(cl.ufro.srhm.orm.Persona value) {
		this.persona = value;
	}
	
	private cl.ufro.srhm.orm.Persona getORM_Persona() {
		return persona;
	}
	
	private void setORM_ReservaHoraMedica(java.util.Set value) {
		this.ORM_reservaHoraMedica = value;
	}
	
	private java.util.Set getORM_ReservaHoraMedica() {
		return ORM_reservaHoraMedica;
	}
	
	@Transient	
	public final cl.ufro.srhm.orm.HoraMedicaSetCollection reservaHoraMedica = new cl.ufro.srhm.orm.HoraMedicaSetCollection(this, _ormAdapter, cl.ufro.srhm.orm.ORMConstants.KEY_RESERVA_RESERVAHORAMEDICA, cl.ufro.srhm.orm.ORMConstants.KEY_HORAMEDICA_RESERVAS, cl.ufro.srhm.orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
