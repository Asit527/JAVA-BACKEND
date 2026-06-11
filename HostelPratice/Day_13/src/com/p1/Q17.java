package com.p1;

public class Q17 {
	int roll;
	String name;
	
	Q17(){
		this(12,"Asit");
		//“Before you do anything in this constructor, go to that other constructor first.”
	}
	Q17(int roll,String name){
		this.roll=roll;// “Put the value you received into my variable.”
		this.name=name;
	}
	
	public static void main(String[]args) {
		Q17 obj1= new Q17();
		System.out.println(obj1.roll);
		System.out.println(obj1.name);
		
	}

}

