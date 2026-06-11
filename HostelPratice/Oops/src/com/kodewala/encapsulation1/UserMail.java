package com.kodewala.encapsulation1;

public class UserMail {
private String email;

public void mailSetter(String email) {
	
	if(email.contains("@")) {
		this.email=email;
		
		System.out.println(email);
		
	}
	
	
	
}
	public static void main(String[] args) {
		UserMail obj1= new UserMail();
		obj1.mailSetter("asigmail.com");
		
		
	}

}
