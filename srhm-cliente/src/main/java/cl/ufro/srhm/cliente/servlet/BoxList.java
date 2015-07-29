package cl.ufro.srhm.cliente.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ufro.srhm.soap.BoxSOAPStub;

/**
 * Servlet implementation class BoxList
 */
public class BoxList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoxList() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoxSOAPStub proxy = new BoxSOAPStub();
		BoxSOAPStub.ObtenerBoxes obtenerBoxes = new BoxSOAPStub.ObtenerBoxes();
		BoxSOAPStub.ObtenerBoxesResponse boxesResponse = new BoxSOAPStub.ObtenerBoxesResponse();
		
		boxesResponse = proxy.obtenerBoxes(obtenerBoxes);
		String boxes = boxesResponse.get_return();
		
		response.getWriter().append(boxes);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
