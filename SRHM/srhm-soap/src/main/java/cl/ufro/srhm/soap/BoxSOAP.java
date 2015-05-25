package cl.ufro.srhm.soap;

import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.orm.PersistentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import cl.ufro.srhm.orm.Box;
import cl.ufro.srhm.orm.BoxCriteria;
import cl.ufro.srhm.orm.BoxDAO;
import cl.ufro.srhm.orm.HoraMedicaCriteria;
import cl.ufro.srhm.orm.ReservaCriteria;
import cl.ufro.srhm.soap.vo.BoxVO;

public class BoxSOAP {
	private static final Logger _logger = LoggerFactory.getLogger(BoxSOAP.class);

	public String obtenerBoxes() {
		String resultado = "[]";

		try {
			@SuppressWarnings("unchecked")
			List<Box> boxes = BoxDAO.queryBox(null, null);
			List<BoxVO> boxesVO = new LinkedList<>();

			for (Box box : boxes) {
				boxesVO.add(BoxVO.fromBox(box));
			}
			Gson gson = new Gson();
			resultado = gson.toJson(boxesVO);

		} catch (PersistentException e) {
			_logger.error("", e);
		}
		return resultado;
	}

	public int obtenerOcupacionBox(int boxId, Date fecha1, Date fecha2) {
		int resultado = 0;

		try {
			ReservaCriteria reservaCriteria = new ReservaCriteria();
			HoraMedicaCriteria horaMedicaCriteria = reservaCriteria.createReservaHoraMedicaCriteria();
			horaMedicaCriteria.fecha.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));
			int totalHorasMedicas = horaMedicaCriteria.list().size();

			BoxCriteria boxCriteria = horaMedicaCriteria.createBoxCriteria();
			boxCriteria.id.eq(boxId);

			int totalOcupacionBox = reservaCriteria.list().size();

			return (totalHorasMedicas != 0) ? totalOcupacionBox * 100 / totalHorasMedicas : 0;

		} catch (PersistentException e) {
			_logger.error("", e);
		}

		return resultado;
	}
}
