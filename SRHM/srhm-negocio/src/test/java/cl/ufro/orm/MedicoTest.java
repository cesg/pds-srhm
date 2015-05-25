package cl.ufro.orm;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.orm.PersistentException;

import cl.ufro.srhm.orm.Medico;
import cl.ufro.srhm.orm.MedicoDAO;

public class MedicoTest {

	@Test
	public void test() throws PersistentException {
		List<Medico> result = MedicoDAO.queryMedico("especialidad_id = 1", null);
	}

}
