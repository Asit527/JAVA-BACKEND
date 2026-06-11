package com.rapido.booking;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws SQLException, ClassNotFoundException

	{

		JDBCPrepStmt prepst = new JDBCPrepStmt();

		Connection con = prepst.getConnection();









		// .create(Connection obj,user id,pickup location, drop location)

//		prepst.create(con, 10, "Point -A", "Point -B");


		// .read(Connection obj , user id)

//		prepst.read(con, 10);


		// .update(Connection obj , status , booking id)

//		prepst.update(con, "Completed", 14);

		// .delete(Connection obj , booking id )

		prepst.delete(con, 15);


	}
}
