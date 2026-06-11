package com.kodewala.RollbackCommit;

import java.sql.SQLException;

public class Driver {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		DebitAndCredit obj1 = new DebitAndCredit();
		obj1.doFundTransfer();
	}
}
