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

public class BoxCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression descripcion;
	public final CollectionExpression horaMedica;
	
	public BoxCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		descripcion = new StringExpression("descripcion", this);
		horaMedica = new CollectionExpression("ORM_horaMedica", this);
	}
	
	public BoxCriteria(PersistentSession session) {
		this(session.createCriteria(Box.class));
	}
	
	public BoxCriteria() throws PersistentException {
		this(cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession());
	}
	
	public HoraMedicaCriteria createHoraMedicaCriteria() {
		return new HoraMedicaCriteria(createCriteria("ORM_horaMedica"));
	}
	
	public Box uniqueBox() {
		return (Box) super.uniqueResult();
	}
	
	public Box[] listBox() {
		java.util.List list = super.list();
		return (Box[]) list.toArray(new Box[list.size()]);
	}
}

