package com.kodewala;

import java.sql.SQLException;

class Driver{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DebitAndCredit obj1 = new DebitAndCredit();
		obj1.doFundTransfer();
	}

}