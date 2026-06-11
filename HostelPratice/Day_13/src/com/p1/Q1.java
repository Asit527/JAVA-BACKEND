package com.p1;

public class Q1 {
	int orderId;
	String itemName;
	int quantity;
	int price;
	Q1(int orderId,String itemName,int quantity,int price){
		this.orderId= orderId;
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
		
	}

	public static void main(String[] args) {
		
		Q1 obj1= new Q1(1,"Butter Chiken",1,240);
		
		System.out.println("orger id : "+obj1.orderId);
		System.out.println("Item Name :"+obj1.itemName);
		System.out.println("Quantity : "+obj1.quantity);
		System.out.println("price : "+obj1.price);
		
		
		
		//---------------------------------------
		Q1 obj2= new Q1(1,"Paneer Masala",1,480);
		
		System.out.println("orger id : "+obj2.orderId);
		System.out.println("Item Name :"+obj2.itemName);
		System.out.println("Quantity : "+obj2.quantity);
		System.out.println("price : "+obj2.price);
	}

}
