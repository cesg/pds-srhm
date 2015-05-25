package cl.ufro.orm;

import static org.junit.Assert.*;

import org.junit.Test;
import org.orm.PersistentException;

import cl.ufro.srhm.orm.Especialidad;
import cl.ufro.srhm.orm.EspecialidadDAO;

public class EspecialidadDAOTest {

	@Test
	public void test() throws PersistentException {
		for (Object especialidad : EspecialidadDAO.queryEspecialidad(null, null)) {
			Especialidad esp = (Especialidad) especialidad;
			System.out.println(esp.getNombre());
		}
		assertTrue(EspecialidadDAO.queryEspecialidad(null, null).size() > 0);
	}

}
