package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Setting the MIME type
		response.setContentType("text/html");

		// Collecting Request Parameter from request object
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String caddr = request.getParameter("caddr");
		String ctype = request.getParameter("ctype");

		// Getting PrintWriter Stream to write a response object
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>RegistrationPage</title></head>");
		out.println("<body bgcolor='lightblue'>");
		out.println("<h1 style='color:red; text-align:center;'>CUSTOMER REGISTRATION PAGE</h1>");

		out.println("<form method='post' action='./third'>");
		out.println("<table align='center'>");
		out.println("<tr><td>CEMAIL</td><td><input type='text' name='cemail'/></td></tr>");
		out.println("<tr><td>CMOBILE</td><td><input type='text' name='cmobile'/></td></tr>");
		out.println("<input type='hidden' name='cid' value='" + cid + "'/>");
		out.println("<input type='hidden' name='cname' value='" + cname + "'/>");
		out.println("<input type='hidden' name='caddr' value='" + caddr + "'/>");
		out.println("<input type='hidden' name='ctype' value='" + ctype + "'/>");
		out.println("<tr><td></td><td><input type='submit' value='finish'/></td></tr>");
		out.println("</table>");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");

		// Closing Stream
		out.close();
	}

}
