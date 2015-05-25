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

public class ReservaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final CollectionExpression reservaHoraMedica;
	
	public ReservaDetachedCriteria() {
		super(cl.ufro.srhm.orm.Reserva.class, cl.ufro.srhm.orm.ReservaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		reservaHoraMedica = new CollectionExpression("ORM_reservaHoraMedica", this.getDetachedCriteria());
	}
	
	public ReservaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cl.ufro.srhm.orm.ReservaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		reservaHoraMedica = new CollectionExpression("ORM_reservaHoraMedica", this.getDetachedCriteria());
	}
	
	public PacienteDetachedCriteria createPacienteCriteria() {
		return new PacienteDetachedCriteria(createCriteria("paciente"));
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public HoraMedicaDetachedCriteria createReservaHoraMedicaCriteria() {
		return new HoraMedicaDetachedCriteria(createCriteria("ORM_reservaHoraMedica"));
	}
	
	public Reserva uniqueReserva(PersistentSession session) {
		return (Reserva) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reserva[] listReserva(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reserva[]) list.toArray(new Reserva[list.size()]);
	}
}

