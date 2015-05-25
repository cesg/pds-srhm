package cl.ufro.orm;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.orm.PersistentException;

import cl.ufro.srhm.orm.HoraMedica;
import cl.ufro.srhm.orm.HoraMedicaCriteria;

public class HoraMedicaTest {

	@Test
	public void test() throws PersistentException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//		Calendar today = Calendar.getInstance();
//		Calendar todayNextYear = Calendar.getInstance();
//		try {
//			today.setTime(sdf.parse("2015"));
//			todayNextYear.setTime(sdf.parse(fecha2));
//		} catch (ParseException e) {
//
//		}
//		HoraMedicaCriteria c = new HoraMedicaCriteria();
//		c.fecha.between(new Timestamp(20150101L), new Timestamp(20151212L));
//		c.reservas.isEmpty();
//		
////		c.setFetchMode("Reserva", FetchMode.JOIN);
//		List<HoraMedica> hm = c.list();
//		
//		System.out.println(hm.size());
	}

}
