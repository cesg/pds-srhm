package cl.ufro.srhm.cliente.servlet;

import cl.ufro.srhm.soap.MedicosSOAPStub;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Servlet implementation class MedicosReporte
 */
public class MedicosReporte extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicosReporte() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("json");

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
        }
        MedicosSOAPStub soapStub = new MedicosSOAPStub();
        MedicosSOAPStub.ObtenerMedicoMasSolicitado medicoMasSolicitado = new MedicosSOAPStub.ObtenerMedicoMasSolicitado();
        medicoMasSolicitado.setFecha1(today.getTime());
        medicoMasSolicitado.setFecha2(todayNextYear.getTime());

        String medicos = soapStub.obtenerMedicoMasSolicitado(medicoMasSolicitado).get_return();
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
