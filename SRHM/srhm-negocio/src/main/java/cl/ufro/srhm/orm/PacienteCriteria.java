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

public class PacienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final CollectionExpression reserva;
	
	public PacienteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
		reserva = new CollectionExpression("ORM_reserva", this);
	}
	
	public PacienteCriteria(PersistentSession session) {
		this(session.createCriteria(Paciente.class));
	}
	
	public PacienteCriteria() throws PersistentException {
		this(cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createUsuarioCriteria() {
		return new PersonaCriteria(createCriteria("usuario"));
	}
	
	public ReservaCriteria createReservaCriteria() {
		return new ReservaCriteria(createCriteria("ORM_reserva"));
	}
	
	public Paciente uniquePaciente() {
		return (Paciente) super.uniqueResult();
	}
	
	public Paciente[] listPaciente() {
		java.util.List list = super.list();
		return (Paciente[]) list.toArray(new Paciente[list.size()]);
	}
}

