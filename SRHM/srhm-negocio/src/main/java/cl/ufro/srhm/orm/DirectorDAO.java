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

public class DirectorDAO {
	private static final org.slf4j.Logger _logger = org.slf4j.LoggerFactory.getLogger(DirectorDAO.class);
	public static Director loadDirectorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadDirectorByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("loadDirectorByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director getDirectorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getDirectorByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("getDirectorByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadDirectorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadDirectorByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director getDirectorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getDirectorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("getDirectorByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Director) session.load(cl.ufro.srhm.orm.Director.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("loadDirectorByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director getDirectorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Director) session.get(cl.ufro.srhm.orm.Director.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("getDirectorByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Director) session.load(cl.ufro.srhm.orm.Director.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadDirectorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director getDirectorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Director) session.get(cl.ufro.srhm.orm.Director.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("getDirectorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirector(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryDirector(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryDirector(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirector(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryDirector(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryDirector(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director[] listDirectorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listDirectorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listDirectorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director[] listDirectorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listDirectorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listDirectorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirector(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Director as Director");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listDirectorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirector(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Director as Director");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Director", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listDirectorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director[] listDirectorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDirector(session, condition, orderBy);
			return (Director[]) list.toArray(new Director[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listDirectorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director[] listDirectorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDirector(session, condition, orderBy, lockMode);
			return (Director[]) list.toArray(new Director[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listDirectorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadDirectorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadDirectorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadDirectorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadDirectorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Director[] directors = listDirectorByQuery(session, condition, orderBy);
		if (directors != null && directors.length > 0)
			return directors[0];
		else
			return null;
	}
	
	public static Director loadDirectorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Director[] directors = listDirectorByQuery(session, condition, orderBy, lockMode);
		if (directors != null && directors.length > 0)
			return directors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDirectorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateDirectorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateDirectorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateDirectorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateDirectorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Director as Director");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateDirectorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Director as Director");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Director", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateDirectorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director createDirector() {
		return new cl.ufro.srhm.orm.Director();
	}
	
	public static boolean save(cl.ufro.srhm.orm.Director director) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().saveObject(director);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(cl.ufro.srhm.orm.Director director)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cl.ufro.srhm.orm.Director director) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().deleteObject(director);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(cl.ufro.srhm.orm.Director director)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Director director)throws PersistentException {
		try {
			if(director.getUsuario() != null) {
				director.getUsuario().setDirector(null);
			}
			
			return delete(director);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Director director, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(director.getUsuario() != null) {
				director.getUsuario().setDirector(null);
			}
			
			try {
				session.delete(director);
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
	
	public static boolean refresh(cl.ufro.srhm.orm.Director director) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().refresh(director);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(cl.ufro.srhm.orm.Director director)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cl.ufro.srhm.orm.Director director) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().evict(director);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(cl.ufro.srhm.orm.Director director)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByCriteria(DirectorCriteria directorCriteria) {
		Director[] directors = listDirectorByCriteria(directorCriteria);
		if(directors == null || directors.length == 0) {
			return null;
		}
		return directors[0];
	}
	
	public static Director[] listDirectorByCriteria(DirectorCriteria directorCriteria) {
		return directorCriteria.listDirector();
	}
}
