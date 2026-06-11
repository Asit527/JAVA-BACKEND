package com.kodewala.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// loading the jdbc driver (optional)
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection object
		String url = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
		String user = "root";
		String password = "root123";

		Connection con = DriverManager.getConnection(url, user, password);

		// create statement object

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from orders");

		while(rs.next()) {
			int id= rs.getInt(1);
			String name= rs.getString(2);
			int price = rs.getInt(3);
//			String status = rs.getString(4);
//			System.out.println("id "+id +" name "+name+" price "+price +" status "+status);

			System.out.println("id "+id +" name "+name+" price "+price);




		}
	}
}
