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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression rut;
	public final StringExpression direccion;
	public final StringExpression fono;
	public final StringExpression email;
	public final StringExpression nombre;
	public final DateExpression f_nacimiento;
	public final StringExpression ciudad;
	public final StringExpression comuna;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression directorId;
	public final AssociationExpression director;
	public final CollectionExpression reserva;
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		rut = new StringExpression("rut", this);
		direccion = new StringExpression("direccion", this);
		fono = new StringExpression("fono", this);
		email = new StringExpression("email", this);
		nombre = new StringExpression("nombre", this);
		f_nacimiento = new DateExpression("f_nacimiento", this);
		ciudad = new StringExpression("ciudad", this);
		comuna = new StringExpression("comuna", this);
		medicoId = new IntegerExpression("medico.id", this);
		medico = new AssociationExpression("medico", this);
		pacienteId = new IntegerExpression("paciente.id", this);
		paciente = new AssociationExpression("paciente", this);
		directorId = new IntegerExpression("director.id", this);
		director = new AssociationExpression("director", this);
		reserva = new CollectionExpression("ORM_reserva", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession());
	}
	
	public MedicoCriteria createMedicoCriteria() {
		return new MedicoCriteria(createCriteria("medico"));
	}
	
	public PacienteCriteria createPacienteCriteria() {
		return new PacienteCriteria(createCriteria("paciente"));
	}
	
	public DirectorCriteria createDirectorCriteria() {
		return new DirectorCriteria(createCriteria("director"));
	}
	
	public ReservaCriteria createReservaCriteria() {
		return new ReservaCriteria(createCriteria("ORM_reserva"));
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

