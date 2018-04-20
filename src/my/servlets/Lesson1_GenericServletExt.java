package my.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Lesson1_GenericServletExt extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		
		pw.println("Hello, extends GenericServlet, it is "+LocalDateTime.now()+" now.");
		
	}

}
