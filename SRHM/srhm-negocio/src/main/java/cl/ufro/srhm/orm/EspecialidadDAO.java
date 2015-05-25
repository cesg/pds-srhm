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

public class EspecialidadDAO {
	private static final org.slf4j.Logger _logger = org.slf4j.LoggerFactory.getLogger(EspecialidadDAO.class);
	public static Especialidad loadEspecialidadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadEspecialidadByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("loadEspecialidadByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad getEspecialidadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getEspecialidadByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("getEspecialidadByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadEspecialidadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEspecialidadByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad getEspecialidadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getEspecialidadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("getEspecialidadByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Especialidad) session.load(cl.ufro.srhm.orm.Especialidad.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("loadEspecialidadByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad getEspecialidadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Especialidad) session.get(cl.ufro.srhm.orm.Especialidad.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("getEspecialidadByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Especialidad) session.load(cl.ufro.srhm.orm.Especialidad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEspecialidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad getEspecialidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Especialidad) session.get(cl.ufro.srhm.orm.Especialidad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("getEspecialidadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryEspecialidad(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryEspecialidad(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryEspecialidad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryEspecialidad(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad[] listEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listEspecialidadByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad[] listEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listEspecialidadByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Especialidad as Especialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listEspecialidadByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryEspecialidad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Especialidad as Especialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Especialidad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listEspecialidadByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad[] listEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEspecialidad(session, condition, orderBy);
			return (Especialidad[]) list.toArray(new Especialidad[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEspecialidadByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad[] listEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEspecialidad(session, condition, orderBy, lockMode);
			return (Especialidad[]) list.toArray(new Especialidad[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEspecialidadByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadEspecialidadByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEspecialidadByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Especialidad[] especialidads = listEspecialidadByQuery(session, condition, orderBy);
		if (especialidads != null && especialidads.length > 0)
			return especialidads[0];
		else
			return null;
	}
	
	public static Especialidad loadEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Especialidad[] especialidads = listEspecialidadByQuery(session, condition, orderBy, lockMode);
		if (especialidads != null && especialidads.length > 0)
			return especialidads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateEspecialidadByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateEspecialidadByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Especialidad as Especialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateEspecialidadByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Especialidad as Especialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Especialidad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateEspecialidadByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad createEspecialidad() {
		return new cl.ufro.srhm.orm.Especialidad();
	}
	
	public static boolean save(cl.ufro.srhm.orm.Especialidad especialidad) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().saveObject(especialidad);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(cl.ufro.srhm.orm.Especialidad especialidad)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cl.ufro.srhm.orm.Especialidad especialidad) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().deleteObject(especialidad);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(cl.ufro.srhm.orm.Especialidad especialidad)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Especialidad especialidad)throws PersistentException {
		try {
			if(especialidad.getMedico() != null) {
				especialidad.getMedico().setEspecialidad(null);
			}
			
			return delete(especialidad);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Especialidad especialidad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(especialidad.getMedico() != null) {
				especialidad.getMedico().setEspecialidad(null);
			}
			
			try {
				session.delete(especialidad);
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
	
	public static boolean refresh(cl.ufro.srhm.orm.Especialidad especialidad) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().refresh(especialidad);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(cl.ufro.srhm.orm.Especialidad especialidad)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cl.ufro.srhm.orm.Especialidad especialidad) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().evict(especialidad);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(cl.ufro.srhm.orm.Especialidad especialidad)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Especialidad loadEspecialidadByCriteria(EspecialidadCriteria especialidadCriteria) {
		Especialidad[] especialidads = listEspecialidadByCriteria(especialidadCriteria);
		if(especialidads == null || especialidads.length == 0) {
			return null;
		}
		return especialidads[0];
	}
	
	public static Especialidad[] listEspecialidadByCriteria(EspecialidadCriteria especialidadCriteria) {
		return especialidadCriteria.listEspecialidad();
	}
}
