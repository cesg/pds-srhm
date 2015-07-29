package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.HoraApsSOAPStub;

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

        int horaMedicaId = Integer.parseInt(request.getParameter("horaMedicaId"));
        int pacienteId = Integer.parseInt(request.getParameter("pacienteId"));
        HoraApsSOAPStub soapStub = new HoraApsSOAPStub();
        HoraApsSOAPStub.ReservarHoraAps reservarHoraAps = new HoraApsSOAPStub.ReservarHoraAps();
        HoraApsSOAPStub.ReservarHoraApsResponse apsResponse = new HoraApsSOAPStub.ReservarHoraApsResponse();
        reservarHoraAps.setHoraMedicaId(horaMedicaId);
        reservarHoraAps.setPacienteId(pacienteId);
        apsResponse = soapStub.reservarHoraAps(reservarHoraAps);
        String horaMedica = apsResponse.get_return();
        response.getWriter().append(horaMedica);
    }

}
