package com.kodewala.RollbackCommit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DebitAndCredit {

	public void doFundTransfer() throws ClassNotFoundException, SQLException {
		// i put conn here bcz catch can be acess it
		Connection con = DriverManager.getConnection(DBDetails.URL, DBDetails.USER, DBDetails.PASSWORD);
		try {
			int amountToBeTransfered= 1000;
			Class.forName("com.mysql.cj.jdbc.Driver");


			// debit -

			PreparedStatement ps1 = con.prepareStatement(DBDetails.GET_BALANCE);
			ps1.setInt(1, 1);
			ResultSet rs1 = ps1.executeQuery();
			int senderCurrentBalance=0;
			while(rs1.next()) {
				senderCurrentBalance=senderCurrentBalance+rs1.getInt(1);
			}
			System.out.println("Sender Current Balance: "+senderCurrentBalance);


			// imp to write bcz we only want to upade the balance if txn completes , if any error happen don,t commit
			con.setAutoCommit(false);


			// update balance - debit

			PreparedStatement ps2 = con.prepareStatement(DBDetails.UPDATE_BALANCE);
			senderCurrentBalance=senderCurrentBalance-amountToBeTransfered;
			ps2.setInt(1, senderCurrentBalance);
			ps2.setInt(2, 1);
			int recordUpdated1 = ps2.executeUpdate();
			System.out.println("Record updated : "+recordUpdated1);

			// credit +

			PreparedStatement ps3 = con.prepareStatement(DBDetails.GET_BALANCE);
			ps3.setInt(1, 2);
			ResultSet rs3 = ps3.executeQuery();
			int recBalance=0;
			while(rs3.next()) {
				recBalance=recBalance+rs3.getInt(1);
			}
			System.out.println("Reciver Balance: "+recBalance);


			// update balance  + credit

					PreparedStatement ps4 = con.prepareStatement(DBDetails.UPDATE_BALANCE);
					recBalance=recBalance+amountToBeTransfered;
					ps4.setInt(1, recBalance);
					ps4.setInt(2, 2);
					int recordUpdated2 = ps4.executeUpdate();
					System.out.println("Record updated : "+recordUpdated2);
					con.commit(); // commit now bcz every thing works fine
		}
		catch (Exception e) {
			//mandatory to write roll back bcz we dont want our db to hang indfiently it should go to previous state
			con.rollback();
			e.printStackTrace();
			System.out.println("doing roll back -- exception occours");

		}



	}

}
