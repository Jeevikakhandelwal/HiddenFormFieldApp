package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Collecting Request Parameter from request object
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String caddr = request.getParameter("caddr");
		String ctype = request.getParameter("ctype");
		String cemail = request.getParameter("cemail");
		String cmobile = request.getParameter("cmobile");

		// Getting PrintWriter Stream to write a response object
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>RegistrationPage</title></head>");
		out.println("<body bgcolor='lightpink'>");
		out.println("<h1 style='color:red; text-align:center;'>CUSTOMER REGISTRATION DETAILS</h1>");
		out.println("<table align='center' border='1'>");
		out.println("<tr><td>CID</td><td>" + cid + "</td></tr>");
		out.println("<tr><td>CNAME</td><td>" + cname + "</td></tr>");
		out.println("<tr><td>CADDR</td><td>" + caddr + "</td></tr>");
		out.println("<tr><td>CTYPE</td><td>" + ctype + "</td></tr>");
		out.println("<tr><td>CEMAIL</td><td>" + cemail + "</td></tr>");
		out.println("<tr><td>CMOBILE</td><td>" + cmobile + "</td></tr>");

		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

		//Closing Stream
		out.close();

	}

}
