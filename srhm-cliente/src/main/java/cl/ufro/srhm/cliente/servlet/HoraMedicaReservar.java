package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.HoraApsSOAPProxy;

/**
 * Servlet implementation class HoraMedicaReservar
 */
public class HoraMedicaReservar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HoraMedicaReservar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("json");
		
		int horaMedicaId = Integer.parseInt( request.getParameter("horaMedicaId"));
		int pacienteId = Integer.parseInt( request.getParameter("pacienteId"));
		
		HoraApsSOAPProxy horaApsSOAP = new HoraApsSOAPProxy();
		String horaMedica = horaApsSOAP.reservarHoraAps(horaMedicaId, pacienteId);
		response.getWriter().append(horaMedica);
	}

}
