package monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieController
 */
@WebServlet("/GetCookie")
public class GetCookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetCookieController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		
		Cookie cookie = null;
		Cookie[] cookies = null;
		cookies = request.getCookies();
		String  bgColor = "white";
		if( cookies != null ) {
		    out.println("<h2> Found Cookies Name and Value</h2>");
		    
		    for (int i = 0; i < cookies.length; i++) {
		       cookie = cookies[i];
		       out.println("Name : " + cookie.getName( ) + ",  ");
//		       out.println("Age : " + cookie.getMaxAge( ) + ",  ");
		       out.println("Value: " + cookie.getValue( )+" <br/>");
		       if(cookie.getName().equals("color"))
		        bgColor = cookie.getValue( );
		    }
		 } else {
		    out.println("<h2>No cookies founds</h2>");
		 }
		
		out.println("<body BGCOLOR=\"<%= bgColor %>\">");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
