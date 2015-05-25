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

public class DirectorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public DirectorDetachedCriteria() {
		super(cl.ufro.srhm.orm.Director.class, cl.ufro.srhm.orm.DirectorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public DirectorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cl.ufro.srhm.orm.DirectorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createUsuarioCriteria() {
		return new PersonaDetachedCriteria(createCriteria("usuario"));
	}
	
	public Director uniqueDirector(PersistentSession session) {
		return (Director) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Director[] listDirector(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Director[]) list.toArray(new Director[list.size()]);
	}
}

