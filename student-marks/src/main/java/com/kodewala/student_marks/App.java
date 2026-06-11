package com.kodewala.student_marks;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// class loading(optioal)
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection object
		String url = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
		String user = "root";
		String password = "root123";

		Connection con = DriverManager.getConnection(url, user, password);

		// create statement object

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from StudentMarks ");

		while (rs.next()) {
			int markId = rs.getInt(1);
			String name = rs.getString(2);
			String sub = rs.getString(3);
			int score = rs.getInt(4);
			Date date = rs.getDate(5);

			System.out.println("Mark ID: " + markId + " Name: " + name + "Subject: " + sub + " Score: " + score
					+ " Date: " + date);

		}

	}
}
