package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class DAOImplementation implements DAOInterface{

	@Override
	public void save(DetailsOfModel dom) {
		CreatingConnection c=new CreatingConnection();
		String sql="insert into userLoginDetails(firstName, surname, gender,email,password,dob) values(?,?,?,?,?,?)";
		System.out.println("Database connection");
		try {
			Connection conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			System.out.println(dom.getFirstName());
			ps.setString(1, dom.getFirstName());
			ps.setString(2, dom.getSurName());
			ps.setString(3, dom.getGender());
			ps.setString(4, dom.getEmail());
			ps.setString(5, dom.getPassword());
			ps.setString(6,dom.getDob());
			
			boolean execute = ps.execute();
			System.out.println(execute);
			
		} catch (SQLException e) {
			e.printStackTrace();
	}
		
	}


}
