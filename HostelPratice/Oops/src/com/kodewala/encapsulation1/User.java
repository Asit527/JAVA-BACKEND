package com.kodewala.encapsulation1;

public class User {
	String name;
	int password;
	public void checkPassword(int password ){
		if(this.password==password) {
			System.out.println("your password is correct: "+password);
		}
		else{
			System.out.println("try again");
		}
	}
	
	public static void main(String[] args) {
		User obj1 = new User();
		obj1.checkPassword(5);
		
	}

}
