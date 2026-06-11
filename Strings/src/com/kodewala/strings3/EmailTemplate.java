package com.kodewala.strings3;

public class EmailTemplate {
	
	
//	static String firstName;
//	static String orderNumber;
//	static String orderStatus;
//	static String companyName;
//	
	
	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("");
		sb.append("Asit");
		System.out.print("Dear, " +sb+"\n");
		sb.append("12345");
		System.out.print("Thank you for reaching out, your order"+sb+"\n");
		
		
		StringBuilder orderNumber= new StringBuilder("");
		orderNumber.append("123");
		
		
		StringBuilder orderStatus= new StringBuilder("");
		orderStatus.append("packed");
		
		StringBuilder companyName= new StringBuilder("");
		companyName.append("Flipkart");
		
		//System.out.println(+" "+orderNumber+" has been sucessfully placed and current status is "+orderStatus);
		System.out.println("Regards, \n"+companyName);
		
		
		

	}

}
