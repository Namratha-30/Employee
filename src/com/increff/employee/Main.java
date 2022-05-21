package com.increff.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/employee","increff","password1234"); 
		
		Statement stmt =con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getInt(2)+" "+ rs.getString(3));
		}
		con.close();
		
		
	}
	

}
