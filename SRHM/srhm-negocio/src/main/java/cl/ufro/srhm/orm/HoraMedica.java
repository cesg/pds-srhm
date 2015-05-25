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
@Table(name="horas_medicas")
public class HoraMedica implements Serializable {
	public HoraMedica() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == cl.ufro.srhm.orm.ORMConstants.KEY_HORAMEDICA_RESERVAS) {
			return ORM_reservas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == cl.ufro.srhm.orm.ORMConstants.KEY_HORAMEDICA_MEDICO) {
			this.medico = (cl.ufro.srhm.orm.Medico) owner;
		}
		
		else if (key == cl.ufro.srhm.orm.ORMConstants.KEY_HORAMEDICA_BOX) {
			this.box = (cl.ufro.srhm.orm.Box) owner;
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
	@GeneratedValue(generator="CL_UFRO_SRHM_ORM_HORAMEDICA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CL_UFRO_SRHM_ORM_HORAMEDICA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=cl.ufro.srhm.orm.Medico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="medico_id", referencedColumnName="id", nullable=false) })	
	private cl.ufro.srhm.orm.Medico medico;
	
	@ManyToOne(targetEntity=cl.ufro.srhm.orm.Box.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="box_id", referencedColumnName="id", nullable=false) })	
	private cl.ufro.srhm.orm.Box box;
	
	@Column(name="fecha", nullable=false)	
	private java.sql.Timestamp fecha;
	
	@ManyToMany(targetEntity=cl.ufro.srhm.orm.Reserva.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="reservas_horas_medicas", joinColumns={ @JoinColumn(name="horas_medica_id") }, inverseJoinColumns={ @JoinColumn(name="reserva_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reservas = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFecha(java.sql.Timestamp value) {
		this.fecha = value;
	}
	
	public java.sql.Timestamp getFecha() {
		return fecha;
	}
	
	public void setMedico(cl.ufro.srhm.orm.Medico value) {
		if (medico != null) {
			medico.horaMedica.remove(this);
		}
		if (value != null) {
			value.horaMedica.add(this);
		}
	}
	
	public cl.ufro.srhm.orm.Medico getMedico() {
		return medico;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Medico(cl.ufro.srhm.orm.Medico value) {
		this.medico = value;
	}
	
	private cl.ufro.srhm.orm.Medico getORM_Medico() {
		return medico;
	}
	
	public void setBox(cl.ufro.srhm.orm.Box value) {
		if (box != null) {
			box.horaMedica.remove(this);
		}
		if (value != null) {
			value.horaMedica.add(this);
		}
	}
	
	public cl.ufro.srhm.orm.Box getBox() {
		return box;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Box(cl.ufro.srhm.orm.Box value) {
		this.box = value;
	}
	
	private cl.ufro.srhm.orm.Box getORM_Box() {
		return box;
	}
	
	private void setORM_Reservas(java.util.Set value) {
		this.ORM_reservas = value;
	}
	
	private java.util.Set getORM_Reservas() {
		return ORM_reservas;
	}
	
	@Transient	
	public final cl.ufro.srhm.orm.ReservaSetCollection reservas = new cl.ufro.srhm.orm.ReservaSetCollection(this, _ormAdapter, cl.ufro.srhm.orm.ORMConstants.KEY_HORAMEDICA_RESERVAS, cl.ufro.srhm.orm.ORMConstants.KEY_RESERVA_RESERVAHORAMEDICA, cl.ufro.srhm.orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
