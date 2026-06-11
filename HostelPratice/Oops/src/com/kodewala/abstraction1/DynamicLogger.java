package com.kodewala.abstraction1;

public class DynamicLogger {
	int x;
	DynamicLogger(int x ){ // constructor
		super();
		this.x=x;
		
	}
	//v1
	void log(String message){
		System.out.println("[INFO]: message.");
	}
	//v2
	void log(String level, String message) {
		System.out.println("[LEVEL]: message (e.g., [ERROR], [WARN]).");
	}
	//v3
	void log(String message, int errorCode) {
		System.out.println("[ERROR - Code: 404]: message.");
		
	}

	public static void main(String[] args) {
		DynamicLogger obj1 =  new DynamicLogger(1);
		System.out.println(obj1.x);
		obj1.log("Hii");
		obj1.log("Hello", "Hii");
		obj1.log("hii", 2);
		System.out.println(obj1.x);
		
	}

}
