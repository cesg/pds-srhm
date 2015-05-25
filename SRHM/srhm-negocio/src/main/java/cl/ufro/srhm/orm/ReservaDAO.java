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

public class ReservaDAO {
	private static final org.slf4j.Logger _logger = org.slf4j.LoggerFactory.getLogger(ReservaDAO.class);
	public static Reserva loadReservaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadReservaByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("loadReservaByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva getReservaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getReservaByORMID(session, id);
		}
		catch (Exception e) {
			_logger.error("getReservaByORMID(int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadReservaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadReservaByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva getReservaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return getReservaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			_logger.error("getReservaByORMID(int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reserva) session.load(cl.ufro.srhm.orm.Reserva.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("loadReservaByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva getReservaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reserva) session.get(cl.ufro.srhm.orm.Reserva.class, new Integer(id));
		}
		catch (Exception e) {
			_logger.error("getReservaByORMID(PersistentSession session, int id)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reserva) session.load(cl.ufro.srhm.orm.Reserva.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadReservaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva getReservaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reserva) session.get(cl.ufro.srhm.orm.Reserva.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			_logger.error("getReservaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryReserva(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryReserva(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return queryReserva(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryReserva(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva[] listReservaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listReservaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listReservaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva[] listReservaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return listReservaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listReservaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Reserva as Reserva");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listReservaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Reserva as Reserva");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reserva", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listReservaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva[] listReservaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReserva(session, condition, orderBy);
			return (Reserva[]) list.toArray(new Reserva[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listReservaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva[] listReservaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReserva(session, condition, orderBy, lockMode);
			return (Reserva[]) list.toArray(new Reserva[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listReservaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadReservaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadReservaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return loadReservaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadReservaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reserva[] reservas = listReservaByQuery(session, condition, orderBy);
		if (reservas != null && reservas.length > 0)
			return reservas[0];
		else
			return null;
	}
	
	public static Reserva loadReservaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reserva[] reservas = listReservaByQuery(session, condition, orderBy, lockMode);
		if (reservas != null && reservas.length > 0)
			return reservas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReservaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateReservaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateReservaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReservaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession();
			return iterateReservaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateReservaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReservaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Reserva as Reserva");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateReservaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReservaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cl.ufro.srhm.orm.Reserva as Reserva");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reserva", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateReservaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva createReserva() {
		return new cl.ufro.srhm.orm.Reserva();
	}
	
	public static boolean save(cl.ufro.srhm.orm.Reserva reserva) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().saveObject(reserva);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(cl.ufro.srhm.orm.Reserva reserva)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cl.ufro.srhm.orm.Reserva reserva) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().deleteObject(reserva);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(cl.ufro.srhm.orm.Reserva reserva)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Reserva reserva)throws PersistentException {
		try {
			if(reserva.getPaciente() != null) {
				reserva.getPaciente().reserva.remove(reserva);
			}
			
			if(reserva.getPersona() != null) {
				reserva.getPersona().reserva.remove(reserva);
			}
			
			cl.ufro.srhm.orm.HoraMedica[] lReservaHoraMedicas = reserva.reservaHoraMedica.toArray();
			for(int i = 0; i < lReservaHoraMedicas.length; i++) {
				lReservaHoraMedicas[i].reservas.remove(reserva);
			}
			return delete(reserva);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cl.ufro.srhm.orm.Reserva reserva, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(reserva.getPaciente() != null) {
				reserva.getPaciente().reserva.remove(reserva);
			}
			
			if(reserva.getPersona() != null) {
				reserva.getPersona().reserva.remove(reserva);
			}
			
			cl.ufro.srhm.orm.HoraMedica[] lReservaHoraMedicas = reserva.reservaHoraMedica.toArray();
			for(int i = 0; i < lReservaHoraMedicas.length; i++) {
				lReservaHoraMedicas[i].reservas.remove(reserva);
			}
			try {
				session.delete(reserva);
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
	
	public static boolean refresh(cl.ufro.srhm.orm.Reserva reserva) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().refresh(reserva);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(cl.ufro.srhm.orm.Reserva reserva)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cl.ufro.srhm.orm.Reserva reserva) throws PersistentException {
		try {
			cl.ufro.srhm.orm.SRHMERPersistentManager.instance().getSession().evict(reserva);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(cl.ufro.srhm.orm.Reserva reserva)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByCriteria(ReservaCriteria reservaCriteria) {
		Reserva[] reservas = listReservaByCriteria(reservaCriteria);
		if(reservas == null || reservas.length == 0) {
			return null;
		}
		return reservas[0];
	}
	
	public static Reserva[] listReservaByCriteria(ReservaCriteria reservaCriteria) {
		return reservaCriteria.listReserva();
	}
}
