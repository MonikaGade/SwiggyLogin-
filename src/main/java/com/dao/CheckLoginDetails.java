package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckLoginDetails {

	public boolean check(String em,String pass) {
		int id  ;
		String email,password;
		boolean result=false;
		CreatingConnection conn = new CreatingConnection();
		String sql="select * from userLoginDetails";
		try {
			Connection c1 = conn.getConnection();
			Statement st = c1.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				id = rs.getInt("id");
				email=rs.getString("email");
				password = rs.getString("password");
				if(em.equals(email)&&pass.equals(password)) {
					result=true;
					break;
				}
				result=false;

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
}
