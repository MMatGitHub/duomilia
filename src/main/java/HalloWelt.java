

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HalloWelt
 */
@WebServlet("/HalloWelt")
public class HalloWelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HalloWelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Set response content type
	    response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<!doctype html>");
		writer.println("<html>");
		writer.println("<head><title>Hallo Welt again!</title></head>");
		writer.println("<body>");
		writer.println("	<h1>Hauptstädte</h1>");
		writer.println("	<h2>Washington</h2>");
		writer.println("	<h2>Madrid</h2>");
		writer.println("	<h2>London</h2>");
		writer.println("	<h2>Paris</h2>");
		writer.println("	<h2>Brussels</h2>");
		writer.println("	<h2>Berlin</h2>");
		writer.println("<body>");
		writer.println("</html>");
			
		writer.close();		
				
	}

}
