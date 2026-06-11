package com.kodewala.inheritance1;

public class Account extends Object {
	private String password="1234";
	private int userId=1423;
	
	
	public void  getUserId(String  password ) {
		if(this.password.equals(password)) {
			System.out.println(this.userId);
		}
	}
	
	
}
class User extends  Account{
	public static void main(String[] args) {
		User obj1= new User();
		obj1.getUserId("1234");
	}
	
	
}
// error