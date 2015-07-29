package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.EspecialidadSOAPStub;

/**
 * Servlet implementation class EspecialidadList
 */
public class EspecialidadList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EspecialidadList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		EspecialidadSOAPStub proxy = new EspecialidadSOAPStub();
		EspecialidadSOAPStub.ObtenerEspecialidades obtenerEspecialidades = new EspecialidadSOAPStub.ObtenerEspecialidades();
		EspecialidadSOAPStub.ObtenerEspecialidadesResponse especialidadesResponse = new EspecialidadSOAPStub.ObtenerEspecialidadesResponse();
		
		especialidadesResponse = proxy.obtenerEspecialidades(obtenerEspecialidades);
		
		String especialidades = especialidadesResponse.get_return();
		response.getWriter().append(especialidades);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
