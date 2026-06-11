package com.kodewala.polymorphism3;

class Regd{
	// v1
	void    doRegisdtraction(String userId,int otp) {
		System.out.println("v1");
	}
	// v2
int doRegisdtraction(String userId, String password) {
	System.out.println("v2");
		return 0;
	}

	
}

public class CompileTimePoly {
	public static void main(String[] args) {
		Regd obj1= new Regd();
		obj1.doRegisdtraction("111", 0);
		obj1.doRegisdtraction("123", "zdwyd32");
		
		
	}

}

// no of arg must be different 
// or type of arg must be different
// or order arg must be different
// we use overloading to give caller the flexibility