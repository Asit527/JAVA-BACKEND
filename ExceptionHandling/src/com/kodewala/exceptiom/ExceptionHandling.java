package com.kodewala.exceptiom;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("start of main()");
		String s=null; // no obj created
		try {
			System.out.println(s.length()); // risky code
			//. dot operator
		}
		catch(NullPointerException e) {
			System.err.println("Exception caught"); // handling code
			System.err.println(e.getMessage());
		}
		
		System.out.println("end of main()");
	}

	}


// .out - normal output -- black
//.err - Error output -- red


//sorround with



