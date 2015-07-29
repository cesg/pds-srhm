package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.MedicosSOAPStub;

/**
 * Servlet implementation class MedicoList
 */
public class MedicoList extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicoList() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int especialidadId = Integer.parseInt(request.getParameter("especialidadId"));
        MedicosSOAPStub soapStub = new MedicosSOAPStub();
        MedicosSOAPStub.ObtenerMedicosDeEspecialidad medicosDeEspecialidad = new MedicosSOAPStub.ObtenerMedicosDeEspecialidad();
        medicosDeEspecialidad.setEspecialidadId(especialidadId);
        String medicos = soapStub.obtenerMedicosDeEspecialidad(medicosDeEspecialidad).get_return();
        response.getWriter().append(medicos);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
