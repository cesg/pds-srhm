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

public class BoxDAO {
	private static final org.slf4j.Logger _logger = org.slf4j.LoggerFactory.getLogger(BoxDAO.class);
	public static Box loadBoxByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadBoxByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("loadBoxByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box getBoxByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getBoxByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("getBoxByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadBoxByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBoxByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box getBoxByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getBoxByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("getBoxByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Box) session.load(cl.ufro.srhm.orm.Box.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("loadBoxByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box getBoxByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Box) session.get(cl.ufro.srhm.orm.Box.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("getBoxByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Box) session.load(cl.ufro.srhm.orm.Box.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBoxByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box getBoxByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Box) session.get(cl.ufro.srhm.orm.Box.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("getBoxByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryBox(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryBox(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryBox(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryBox(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box[] listBoxByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listBoxByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listBoxByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box[] listBoxByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listBoxByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listBoxByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Box as Box");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listBoxByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Box as Box");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Box", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listBoxByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box[] listBoxByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBox(session, condition, orderBy);
			return (Box[]) list.toArray(new Box[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBoxByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box[] listBoxByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBox(session, condition, orderBy, lockMode);
			return (Box[]) list.toArray(new Box[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBoxByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadBoxByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadBoxByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadBoxByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBoxByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Box[] boxs = listBoxByQuery(session, condition, orderBy);
		if (boxs != null && boxs.length > 0)
			return boxs[0];
		else
			return null;
	}
	
	public static Box loadBoxByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Box[] boxs = listBoxByQuery(session, condition, orderBy, lockMode);
		if (boxs != null && boxs.length > 0)
			return boxs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBoxByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateBoxByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateBoxByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoxByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateBoxByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateBoxByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoxByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Box as Box");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateBoxByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoxByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Box as Box");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Box", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateBoxByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box createBox() {
		return new cl.ufro.srhm.orm.Box();
	}
	
	public static boolean save(cl.ufro.srhm.orm.Box box) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().saveObject(box);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(cl.ufro.srhm.orm.Box box)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cl.ufro.srhm.orm.Box box) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().deleteObject(box);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(cl.ufro.srhm.orm.Box box)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Box box)throws PersistentException {
		try {
			cl.ufro.srhm.orm.HoraMedica[] lHoraMedicas = box.horaMedica.toArray();
			for(int i = 0; i < lHoraMedicas.length; i++) {
				lHoraMedicas[i].setBox(null);
			}
			return delete(box);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Box box, org.orm.PersistentSession session)throws PersistentException {
		try {
			cl.ufro.srhm.orm.HoraMedica[] lHoraMedicas = box.horaMedica.toArray();
			for(int i = 0; i < lHoraMedicas.length; i++) {
				lHoraMedicas[i].setBox(null);
			}
			try {
				session.delete(box);
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
	
	public static boolean refresh(cl.ufro.srhm.orm.Box box) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().refresh(box);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(cl.ufro.srhm.orm.Box box)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cl.ufro.srhm.orm.Box box) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().evict(box);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(cl.ufro.srhm.orm.Box box)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByCriteria(BoxCriteria boxCriteria) {
		Box[] boxs = listBoxByCriteria(boxCriteria);
		if(boxs == null || boxs.length == 0) {
			return null;
		}
		return boxs[0];
	}
	
	public static Box[] listBoxByCriteria(BoxCriteria boxCriteria) {
		return boxCriteria.listBox();
	}
}
