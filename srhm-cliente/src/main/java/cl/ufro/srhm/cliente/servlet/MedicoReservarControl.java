package cl.ufro.srhm.cliente.servlet;

import cl.ufro.srhm.soap.HoraApsSOAPStub;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

        HoraApsSOAPStub soapStub = new HoraApsSOAPStub();
        HoraApsSOAPStub.ReservarHoraMedicaControl horaMedicaControl = new HoraApsSOAPStub.ReservarHoraMedicaControl();
        horaMedicaControl.setHorasMedicasIds(horasIds);
        horaMedicaControl.setPacienteId(pacienteId);
        String reserva = soapStub.reservarHoraMedicaControl(horaMedicaControl).get_return();
        response.getWriter().print(reserva);
    }

}
