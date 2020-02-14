package myapi;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Tryy extends HttpServlet{
	private String message;
	public void init() throws ServletException{
		message="Plz enter the valid fields for get request!!";
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1 style='color:red'>"+message+"</h1>");
	}
	public void destroy() {
		
	}
}
