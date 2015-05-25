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

public class BoxDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression descripcion;
	public final CollectionExpression horaMedica;
	
	public BoxDetachedCriteria() {
		super(cl.ufro.srhm.orm.Box.class, cl.ufro.srhm.orm.BoxCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		horaMedica = new CollectionExpression("ORM_horaMedica", this.getDetachedCriteria());
	}
	
	public BoxDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cl.ufro.srhm.orm.BoxCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		horaMedica = new CollectionExpression("ORM_horaMedica", this.getDetachedCriteria());
	}
	
	public HoraMedicaDetachedCriteria createHoraMedicaCriteria() {
		return new HoraMedicaDetachedCriteria(createCriteria("ORM_horaMedica"));
	}
	
	public Box uniqueBox(PersistentSession session) {
		return (Box) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Box[] listBox(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Box[]) list.toArray(new Box[list.size()]);
	}
}

