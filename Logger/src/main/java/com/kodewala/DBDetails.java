package com.kodewala;

public class DBDetails {
	public static final String URL = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
	public static final String USER ="root";
	public static final String PASSWORD = "root123";

	public static final String  GET_BALANCE= "select amount from commit_rollback_txn where user_id = ?";

	public static final String  UPDATE_BALANCE= "update commit_rollback_txn set amount =? where user_id=?";



}
