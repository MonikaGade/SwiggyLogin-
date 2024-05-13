package com.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import com.dao.DAOImplementation;
import com.dao.DetailsOfModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet (name="signup",urlPatterns = "/submitdetails")
public class CheckDetails extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fn = req.getParameter("firstName");
		System.out.println("first"+fn);
		String sn = req.getParameter("surname");
		String email = req.getParameter("emailorphone");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		DetailsOfModel d1=new DetailsOfModel(fn,sn,email,password,dob,gender);
		System.out.println(d1.toString());
		DAOImplementation dao=new DAOImplementation();
		dao.save(d1);
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.println("<link rel='stylesheet' href='css/bootstrap.css'>");
		writer.println("<a href='login.html'>Log In</a>");
	}



}
