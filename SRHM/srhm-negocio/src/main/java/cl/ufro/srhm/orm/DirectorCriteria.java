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

public class DirectorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public DirectorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
	}
	
	public DirectorCriteria(PersistentSession session) {
		this(session.createCriteria(Director.class));
	}
	
	public DirectorCriteria() throws PersistentException {
		this(cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createUsuarioCriteria() {
		return new PersonaCriteria(createCriteria("usuario"));
	}
	
	public Director uniqueDirector() {
		return (Director) super.uniqueResult();
	}
	
	public Director[] listDirector() {
		java.util.List list = super.list();
		return (Director[]) list.toArray(new Director[list.size()]);
	}
}

