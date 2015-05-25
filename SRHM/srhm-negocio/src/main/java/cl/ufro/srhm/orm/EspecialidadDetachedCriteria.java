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

public class EspecialidadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	
	public EspecialidadDetachedCriteria() {
		super(cl.ufro.srhm.orm.Especialidad.class, cl.ufro.srhm.orm.EspecialidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
	}
	
	public EspecialidadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cl.ufro.srhm.orm.EspecialidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
	}
	
	public MedicoDetachedCriteria createMedicoCriteria() {
		return new MedicoDetachedCriteria(createCriteria("medico"));
	}
	
	public Especialidad uniqueEspecialidad(PersistentSession session) {
		return (Especialidad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Especialidad[] listEspecialidad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Especialidad[]) list.toArray(new Especialidad[list.size()]);
	}
}

