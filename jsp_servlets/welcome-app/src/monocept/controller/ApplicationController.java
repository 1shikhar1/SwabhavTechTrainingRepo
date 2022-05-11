package monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApplicationController
 */
@WebServlet("/Application")
public class ApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ApplicationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext application = request.getServletContext();
		
		out.println("<html><body>");
		
	    out.println("<h1>Application page </h1>");
        Integer i = (Integer)application.getAttribute("counter");
        if(i==null){
            i=0;
        }


        out.println("<h2>Old value: "+i+" </h2>");
        i++;
        out.println("<h2>New value: "+i+" </h2>");
        application.setAttribute("counter",i);
        out.println("<a href=\"summary.jsp\">Summary page</a>");
		
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
