package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.HoraApsSOAPProxy;

/**
 * Servlet implementation class MedicoReservarControl
 */
public class MedicoReservarControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicoReservarControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("json");
		
		int itr = -1;
		String ids[] = request.getParameterValues("horasIds[]");
		
		int pacienteId = Integer.parseInt(request.getParameter("pacienteId"));
		
		int horasIds[] = new int[ids.length];
		for (String string : ids) {
			horasIds[++itr] = Integer.parseInt(string);
		}

		System.out.println(ids.length);
		
		HoraApsSOAPProxy horaApsSOAP = new HoraApsSOAPProxy();
		String reserva = horaApsSOAP.reservarHoraMedicaControl(horasIds, pacienteId);
		response.getWriter().print(reserva);
	}

}
