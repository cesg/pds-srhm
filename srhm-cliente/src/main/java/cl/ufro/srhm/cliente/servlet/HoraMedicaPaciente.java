package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.HoraApsSOAPStub;
import cl.ufro.srhm.soap.HoraApsSOAPStub.BuscarHorasMedicasPaciente;

/**
 * Servlet implementation class HoraMedicaPaciente
 */
public class HoraMedicaPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HoraMedicaPaciente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		HoraApsSOAPStub soapStub = new HoraApsSOAPStub();
		BuscarHorasMedicasPaciente buscarHorasMedicasPaciente = new BuscarHorasMedicasPaciente();
		buscarHorasMedicasPaciente.setId(id);
		
		String resultado = soapStub.buscarHorasMedicasPaciente(buscarHorasMedicasPaciente).get_return();
		
		response.getWriter().println(resultado);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
