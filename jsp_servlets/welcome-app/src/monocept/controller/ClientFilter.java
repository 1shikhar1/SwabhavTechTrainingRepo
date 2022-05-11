package monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/Auth")
public class ClientFilter implements Filter {

    public ClientFilter() {
    	
    }
    
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		String ipAddress = request.getRemoteAddr();
	      
	      // Log the IP address and current timestamp.
	      System.out.println("IP "+ ipAddress + ", Time "+ new Date().toString());
		// pass the request along the filter chain
	      
	      if(!ipAddress.equals("192.168.43.1"))
	    	  chain.doFilter(request, response);
	      else
	    	  out.println("You are blocked!");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
