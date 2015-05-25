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

public class MedicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final IntegerExpression especialidadId;
	public final AssociationExpression especialidad;
	public final CollectionExpression horaMedica;
	
	public MedicoDetachedCriteria() {
		super(cl.ufro.srhm.orm.Medico.class, cl.ufro.srhm.orm.MedicoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		especialidadId = new IntegerExpression("especialidad.id", this.getDetachedCriteria());
		especialidad = new AssociationExpression("especialidad", this.getDetachedCriteria());
		horaMedica = new CollectionExpression("ORM_horaMedica", this.getDetachedCriteria());
	}
	
	public MedicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cl.ufro.srhm.orm.MedicoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		especialidadId = new IntegerExpression("especialidad.id", this.getDetachedCriteria());
		especialidad = new AssociationExpression("especialidad", this.getDetachedCriteria());
		horaMedica = new CollectionExpression("ORM_horaMedica", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createUsuarioCriteria() {
		return new PersonaDetachedCriteria(createCriteria("usuario"));
	}
	
	public EspecialidadDetachedCriteria createEspecialidadCriteria() {
		return new EspecialidadDetachedCriteria(createCriteria("especialidad"));
	}
	
	public HoraMedicaDetachedCriteria createHoraMedicaCriteria() {
		return new HoraMedicaDetachedCriteria(createCriteria("ORM_horaMedica"));
	}
	
	public Medico uniqueMedico(PersistentSession session) {
		return (Medico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Medico[] listMedico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Medico[]) list.toArray(new Medico[list.size()]);
	}
}

