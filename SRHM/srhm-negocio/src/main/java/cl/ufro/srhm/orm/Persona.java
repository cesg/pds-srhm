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
@Table(name="personas")
public class Persona implements Serializable {
	public Persona() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == cl.ufro.srhm.orm.ORMConstants.KEY_PERSONA_RESERVA) {
			return ORM_reserva;
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
	@GeneratedValue(generator="CL_UFRO_SRHM_ORM_PERSONA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CL_UFRO_SRHM_ORM_PERSONA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="rut", nullable=true, unique=true, length=20)	
	private String rut;
	
	@Column(name="direccion", nullable=true, length=160)	
	private String direccion;
	
	@Column(name="fono", nullable=true, length=16)	
	private String fono;
	
	@Column(name="email", nullable=true, length=160)	
	private String email;
	
	@Column(name="nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="f_nacimiento", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date f_nacimiento;
	
	@Column(name="ciudad", nullable=true, length=60)	
	private String ciudad;
	
	@Column(name="comuna", nullable=true, length=60)	
	private String comuna;
	
	@Column(name="activo", nullable=true, length=1)	
	private Byte activo;
	
	@OneToOne(mappedBy="usuario", targetEntity=cl.ufro.srhm.orm.Medico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private cl.ufro.srhm.orm.Medico medico;
	
	@OneToOne(mappedBy="usuario", targetEntity=cl.ufro.srhm.orm.Paciente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private cl.ufro.srhm.orm.Paciente paciente;
	
	@OneToOne(mappedBy="usuario", targetEntity=cl.ufro.srhm.orm.Director.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private cl.ufro.srhm.orm.Director director;
	
	@OneToMany(mappedBy="persona", targetEntity=cl.ufro.srhm.orm.Reserva.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reserva = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setFono(String value) {
		this.fono = value;
	}
	
	public String getFono() {
		return fono;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setF_nacimiento(java.util.Date value) {
		this.f_nacimiento = value;
	}
	
	public java.util.Date getF_nacimiento() {
		return f_nacimiento;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setComuna(String value) {
		this.comuna = value;
	}
	
	public String getComuna() {
		return comuna;
	}
	
	public void setActivo(byte value) {
		setActivo(new Byte(value));
	}
	
	public void setActivo(Byte value) {
		this.activo = value;
	}
	
	public Byte getActivo() {
		return activo;
	}
	
	public void setMedico(cl.ufro.srhm.orm.Medico value) {
		if (this.medico != value) {
			cl.ufro.srhm.orm.Medico lmedico = this.medico;
			this.medico = value;
			if (value != null) {
				medico.setUsuario(this);
			}
			if (lmedico != null) {
				lmedico.setUsuario(null);
			}
		}
	}
	
	public cl.ufro.srhm.orm.Medico getMedico() {
		return medico;
	}
	
	public void setPaciente(cl.ufro.srhm.orm.Paciente value) {
		if (this.paciente != value) {
			cl.ufro.srhm.orm.Paciente lpaciente = this.paciente;
			this.paciente = value;
			if (value != null) {
				paciente.setUsuario(this);
			}
			if (lpaciente != null) {
				lpaciente.setUsuario(null);
			}
		}
	}
	
	public cl.ufro.srhm.orm.Paciente getPaciente() {
		return paciente;
	}
	
	public void setDirector(cl.ufro.srhm.orm.Director value) {
		if (this.director != value) {
			cl.ufro.srhm.orm.Director ldirector = this.director;
			this.director = value;
			if (value != null) {
				director.setUsuario(this);
			}
			if (ldirector != null) {
				ldirector.setUsuario(null);
			}
		}
	}
	
	public cl.ufro.srhm.orm.Director getDirector() {
		return director;
	}
	
	private void setORM_Reserva(java.util.Set value) {
		this.ORM_reserva = value;
	}
	
	private java.util.Set getORM_Reserva() {
		return ORM_reserva;
	}
	
	@Transient	
	public final cl.ufro.srhm.orm.ReservaSetCollection reserva = new cl.ufro.srhm.orm.ReservaSetCollection(this, _ormAdapter, cl.ufro.srhm.orm.ORMConstants.KEY_PERSONA_RESERVA, cl.ufro.srhm.orm.ORMConstants.KEY_RESERVA_PERSONA, cl.ufro.srhm.orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
