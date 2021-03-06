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

public class ReservaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression reservaHoraMedica;
	
	public ReservaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		pacienteId = new IntegerExpression("paciente.id", this);
		paciente = new AssociationExpression("paciente", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		reservaHoraMedica = new CollectionExpression("ORM_reservaHoraMedica", this);
	}
	
	public ReservaCriteria(PersistentSession session) {
		this(session.createCriteria(Reserva.class));
	}
	
	public ReservaCriteria() throws PersistentException {
		this(cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession());
	}
	
	public PacienteCriteria createPacienteCriteria() {
		return new PacienteCriteria(createCriteria("paciente"));
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public HoraMedicaCriteria createReservaHoraMedicaCriteria() {
		return new HoraMedicaCriteria(createCriteria("ORM_reservaHoraMedica"));
	}
	
	public Reserva uniqueReserva() {
		return (Reserva) super.uniqueResult();
	}
	
	public Reserva[] listReserva() {
		java.util.List list = super.list();
		return (Reserva[]) list.toArray(new Reserva[list.size()]);
	}
}

