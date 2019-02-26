package aiss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//        out.println("<!doctype html>");
//        out.println("<html>");
//        out.println("<head><title>Form response</title></head>");
//        out.println("<body>");
//        out.println("<h1>Formulario recibido</h1><p>");
//        out.println("<strong>Nombre: </strong>" + request.getParameter("name") + "<br>");
//        out.println("<strong>Telefono: </strong>" + request.getParameter("phone") + "<br>");        
//        out.println("</p></body></html>");
		
		request.getRequestDispatcher("/form_response.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
