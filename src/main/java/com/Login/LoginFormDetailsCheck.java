package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import com.dao.CheckLoginDetails;
import com.dao.UserModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet (name="login",urlPatterns = "/login")
public class LoginFormDetailsCheck extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CheckLoginDetails cld = new CheckLoginDetails();
		String p1 = req.getParameter("emailorPhone");
		String p2 = req.getParameter("password");
		boolean check = cld.check(p1,p2);
		
		PrintWriter writer = resp.getWriter();
		if(check) {
		HttpSession session = req.getSession();
		boolean new1 = session.isNew();
		String id = session.getId();
		System.out.println(id);
		session.setAttribute("Authenication", "confirmation");
		System.out.println(session.getAttribute("Authenication"));
		
		long creationTime = session.getCreationTime();
		System.out.println(creationTime);
		long lastAccessedTime = session.getLastAccessedTime();
		System.out.println(lastAccessedTime);
		System.out.println(session.getMaxInactiveInterval());
		writer.println("<link rel='stylesheet' href='css/bootstrap.css'>");
		resp.setContentType("text/html");
		resp.sendRedirect("Swiggy/index.html");
		}else {
		  writer.println("<h1>Please enter valid Authentication details</h1>");
		}
	
	}
	
}
