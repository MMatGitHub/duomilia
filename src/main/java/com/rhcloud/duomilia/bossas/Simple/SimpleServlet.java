package com.rhcloud.duomilia.bossas.Simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, 
		         HttpServletResponse response)
		        throws ServletException, IOException
		  {
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();

		    out.println("<title>Example</title>" +
		       "<body bgcolor=FFFFFF>");

		    out.println("<h2>aölskjdöfasdfasdfasdflkjaösldkjf</h2>");

	
		    out.close();
		 
	}
		 
		 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		        response.setContentType("text/html");
		        PrintWriter out=response.getWriter();

		        out.print("<html><body>");
		        out.print("<h3>Hello Servlet</h3>");
		        out.print("</body></html>");
		        out.close();
		    }

}
