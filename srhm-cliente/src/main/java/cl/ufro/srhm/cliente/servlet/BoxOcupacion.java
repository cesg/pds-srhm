package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.BoxSOAPStub;

/**
 * Servlet implementation class BoxOcupacion
 */
public class BoxOcupacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoxOcupacion() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int boxId = Integer.parseInt(request.getParameter("boxId"));
		String fecha1 = request.getParameter("fecha1");
		String fecha2 = request.getParameter("fecha2");
		
		BoxSOAPStub boxProxy = new BoxSOAPStub();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		Calendar today = Calendar.getInstance();
		Calendar todayNextYear = Calendar.getInstance();
		try {
			today.setTime(sdf.parse(fecha1));
			todayNextYear.setTime(sdf.parse(fecha2));
		} catch (ParseException e) {

		}
		
		BoxSOAPStub.ObtenerOcupacionBox obtenerOcupacionBox = new BoxSOAPStub.ObtenerOcupacionBox();
		BoxSOAPStub.ObtenerOcupacionBoxResponse boxResponse = new BoxSOAPStub.ObtenerOcupacionBoxResponse();
		
		obtenerOcupacionBox.setBoxId(boxId);
		obtenerOcupacionBox.setFecha1(today.getTime());
		obtenerOcupacionBox.setFecha2(todayNextYear.getTime());
		boxResponse = boxProxy.obtenerOcupacionBox(obtenerOcupacionBox);
		int ocupacion = boxResponse.get_return();
		
		response.getWriter().append("" + ocupacion);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
