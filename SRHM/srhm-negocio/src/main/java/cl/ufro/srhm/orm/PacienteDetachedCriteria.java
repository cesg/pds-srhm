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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PacienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final CollectionExpression reserva;
	
	public PacienteDetachedCriteria() {
		super(cl.ufro.srhm.orm.Paciente.class, cl.ufro.srhm.orm.PacienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		reserva = new CollectionExpression("ORM_reserva", this.getDetachedCriteria());
	}
	
	public PacienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cl.ufro.srhm.orm.PacienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		reserva = new CollectionExpression("ORM_reserva", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createUsuarioCriteria() {
		return new PersonaDetachedCriteria(createCriteria("usuario"));
	}
	
	public ReservaDetachedCriteria createReservaCriteria() {
		return new ReservaDetachedCriteria(createCriteria("ORM_reserva"));
	}
	
	public Paciente uniquePaciente(PersistentSession session) {
		return (Paciente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paciente[] listPaciente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paciente[]) list.toArray(new Paciente[list.size()]);
	}
}

