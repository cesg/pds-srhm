package cl.ufro.srhm.cliente.servlet;

import cl.ufro.srhm.soap.PacienteSOAPStub;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class PacienteList
 */
public class PacienteList extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PacienteList() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("json");

        PacienteSOAPStub soapStub = new PacienteSOAPStub();
        PacienteSOAPStub.ObtenerPacientes pacientes = new PacienteSOAPStub.ObtenerPacientes();
        String pacientesJson = soapStub.obtenerPacientes(pacientes).get_return();
        response.getWriter().append(pacientesJson);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
