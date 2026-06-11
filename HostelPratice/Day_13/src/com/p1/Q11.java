package com.p1;

public class Q11 {
	int orderId;
	String orderName;
	Q11(int orderId,String orderName){
		
		this.orderId= orderId;
		this.orderName=orderName;
	}

}
class Q11Inner{
	Q11 q11;// variable declaration
	Q11Inner(Q11 q11){
		this.q11= q11;
	}
	public static void main(String[]args) {
		Q11 obj1= new Q11(121,"Butter chiken");
		
		Q11Inner obj2= new Q11Inner(obj1);
		System.out.println("Order Id : "+obj2.q11.orderId+"\nOrder Name : "+obj2.q11.orderName);
		
		
		
	}
}
