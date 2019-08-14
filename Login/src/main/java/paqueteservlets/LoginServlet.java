package paqueteservlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

 /**
	 * 
	 */
	private static final long serialVersionUID = -1588737579520225389L;

public void doGet(HttpServletRequest request, 
  HttpServletResponse response) 
  throws ServletException, IOException {
  
	request.getRequestDispatcher("/respuesta.jsp").include(request, response); 

 }

public void doPost(HttpServletRequest request, 
		  HttpServletResponse response) 
		  throws ServletException, IOException {
	
				System.out.println("Do your post action here");
		  

		 }
}
