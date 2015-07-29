package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.MedicosSOAPStub;

/**
 * Servlet implementation class MedicoDisponibilidad
 */
public class MedicoDisponibilidad extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicoDisponibilidad() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("json");

        int medicoId = Integer.parseInt(request.getParameter("medicoId"));

        String fecha1 = request.getParameter("fecha1");
        String fecha2 = request.getParameter("fecha2");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Calendar today = Calendar.getInstance();
        Calendar todayNextYear = Calendar.getInstance();
        try {
            today.setTime(sdf.parse(fecha1));
            todayNextYear.setTime(sdf.parse(fecha2));
        } catch (ParseException e) {
            todayNextYear.add(Calendar.DAY_OF_MONTH, 1);
            System.err.println(e);
        }

        MedicosSOAPStub soapStub = new MedicosSOAPStub();
        MedicosSOAPStub.BuscarSuDisponibilidad disponibilidadHoras = new MedicosSOAPStub.BuscarSuDisponibilidad();
        disponibilidadHoras.setMedicoId(medicoId);
        disponibilidadHoras.setFecha1(today.getTime());
        disponibilidadHoras.setFecha2(todayNextYear.getTime());
        String disponibilidad = soapStub.buscarSuDisponibilidad(disponibilidadHoras).get_return();
        response.getWriter().append(disponibilidad);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
