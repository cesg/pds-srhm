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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class MedicoDAO {
	private static final org.slf4j.Logger _logger = org.slf4j.LoggerFactory.getLogger(MedicoDAO.class);
	public static Medico loadMedicoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadMedicoByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("loadMedicoByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico getMedicoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getMedicoByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("getMedicoByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadMedicoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicoByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico getMedicoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getMedicoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("getMedicoByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Medico) session.load(cl.ufro.srhm.orm.Medico.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("loadMedicoByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico getMedicoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Medico) session.get(cl.ufro.srhm.orm.Medico.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("getMedicoByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medico) session.load(cl.ufro.srhm.orm.Medico.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico getMedicoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medico) session.get(cl.ufro.srhm.orm.Medico.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("getMedicoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryMedico(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryMedico(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryMedico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryMedico(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico[] listMedicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listMedicoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico[] listMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listMedicoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Medico as Medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listMedicoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Medico as Medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Medico", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listMedicoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico[] listMedicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMedico(session, condition, orderBy);
			return (Medico[]) list.toArray(new Medico[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMedicoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico[] listMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMedico(session, condition, orderBy, lockMode);
			return (Medico[]) list.toArray(new Medico[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMedicoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadMedicoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Medico[] medicos = listMedicoByQuery(session, condition, orderBy);
		if (medicos != null && medicos.length > 0)
			return medicos[0];
		else
			return null;
	}
	
	public static Medico loadMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Medico[] medicos = listMedicoByQuery(session, condition, orderBy, lockMode);
		if (medicos != null && medicos.length > 0)
			return medicos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMedicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateMedicoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateMedicoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Medico as Medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMedicoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Medico as Medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Medico", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMedicoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico createMedico() {
		return new cl.ufro.srhm.orm.Medico();
	}
	
	public static boolean save(cl.ufro.srhm.orm.Medico medico) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().saveObject(medico);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(cl.ufro.srhm.orm.Medico medico)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cl.ufro.srhm.orm.Medico medico) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().deleteObject(medico);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(cl.ufro.srhm.orm.Medico medico)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Medico medico)throws PersistentException {
		try {
			if(medico.getUsuario() != null) {
				medico.getUsuario().setMedico(null);
			}
			
			if(medico.getEspecialidad() != null) {
				medico.getEspecialidad().setMedico(null);
			}
			
			cl.ufro.srhm.orm.HoraMedica[] lHoraMedicas = medico.horaMedica.toArray();
			for(int i = 0; i < lHoraMedicas.length; i++) {
				lHoraMedicas[i].setMedico(null);
			}
			return delete(medico);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Medico medico, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(medico.getUsuario() != null) {
				medico.getUsuario().setMedico(null);
			}
			
			if(medico.getEspecialidad() != null) {
				medico.getEspecialidad().setMedico(null);
			}
			
			cl.ufro.srhm.orm.HoraMedica[] lHoraMedicas = medico.horaMedica.toArray();
			for(int i = 0; i < lHoraMedicas.length; i++) {
				lHoraMedicas[i].setMedico(null);
			}
			try {
				session.delete(medico);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(cl.ufro.srhm.orm.Medico medico) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().refresh(medico);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(cl.ufro.srhm.orm.Medico medico)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cl.ufro.srhm.orm.Medico medico) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().evict(medico);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(cl.ufro.srhm.orm.Medico medico)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByCriteria(MedicoCriteria medicoCriteria) {
		Medico[] medicos = listMedicoByCriteria(medicoCriteria);
		if(medicos == null || medicos.length == 0) {
			return null;
		}
		return medicos[0];
	}
	
	public static Medico[] listMedicoByCriteria(MedicoCriteria medicoCriteria) {
		return medicoCriteria.listMedico();
	}
}
