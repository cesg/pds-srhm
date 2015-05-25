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

public class HoraMedicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final IntegerExpression boxId;
	public final AssociationExpression box;
	public final TimestampExpression fecha;
	public final CollectionExpression reservas;
	
	public HoraMedicaDetachedCriteria() {
		super(cl.ufro.srhm.orm.HoraMedica.class, cl.ufro.srhm.orm.HoraMedicaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		boxId = new IntegerExpression("box.id", this.getDetachedCriteria());
		box = new AssociationExpression("box", this.getDetachedCriteria());
		fecha = new TimestampExpression("fecha", this.getDetachedCriteria());
		reservas = new CollectionExpression("ORM_reservas", this.getDetachedCriteria());
	}
	
	public HoraMedicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cl.ufro.srhm.orm.HoraMedicaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		boxId = new IntegerExpression("box.id", this.getDetachedCriteria());
		box = new AssociationExpression("box", this.getDetachedCriteria());
		fecha = new TimestampExpression("fecha", this.getDetachedCriteria());
		reservas = new CollectionExpression("ORM_reservas", this.getDetachedCriteria());
	}
	
	public MedicoDetachedCriteria createMedicoCriteria() {
		return new MedicoDetachedCriteria(createCriteria("medico"));
	}
	
	public BoxDetachedCriteria createBoxCriteria() {
		return new BoxDetachedCriteria(createCriteria("box"));
	}
	
	public ReservaDetachedCriteria createReservasCriteria() {
		return new ReservaDetachedCriteria(createCriteria("ORM_reservas"));
	}
	
	public HoraMedica uniqueHoraMedica(PersistentSession session) {
		return (HoraMedica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public HoraMedica[] listHoraMedica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (HoraMedica[]) list.toArray(new HoraMedica[list.size()]);
	}
}

