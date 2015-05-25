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

public class MedicoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final IntegerExpression especialidadId;
	public final AssociationExpression especialidad;
	public final CollectionExpression horaMedica;
	
	public MedicoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
		especialidadId = new IntegerExpression("especialidad.id", this);
		especialidad = new AssociationExpression("especialidad", this);
		horaMedica = new CollectionExpression("ORM_horaMedica", this);
	}
	
	public MedicoCriteria(PersistentSession session) {
		this(session.createCriteria(Medico.class));
	}
	
	public MedicoCriteria() throws PersistentException {
		this(cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createUsuarioCriteria() {
		return new PersonaCriteria(createCriteria("usuario"));
	}
	
	public EspecialidadCriteria createEspecialidadCriteria() {
		return new EspecialidadCriteria(createCriteria("especialidad"));
	}
	
	public HoraMedicaCriteria createHoraMedicaCriteria() {
		return new HoraMedicaCriteria(createCriteria("ORM_horaMedica"));
	}
	
	public Medico uniqueMedico() {
		return (Medico) super.uniqueResult();
	}
	
	public Medico[] listMedico() {
		java.util.List list = super.list();
		return (Medico[]) list.toArray(new Medico[list.size()]);
	}
}

