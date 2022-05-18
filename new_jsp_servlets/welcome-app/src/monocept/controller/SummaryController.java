package monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Summary")
public class SummaryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SummaryController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession();
		
		out.println("<html><body>");
		
	    out.println("<h1>Summary page </h1>");
	    Integer i = (Integer)session.getAttribute("counter");
	    if(i==null){
	        i=0;
	    }

	    String id = session.getId();
	    out.println("<h1>Session id: "+id+" </h1>");

	    out.println("<h2>Old value: "+i+" </h2>");
	    i++;
	    out.println("<h2>New value: "+i+" </h2>");
	    session.setAttribute("counter",i);
	    
	    out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
