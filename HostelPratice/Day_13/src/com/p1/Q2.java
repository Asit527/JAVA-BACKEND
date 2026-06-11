package com.p1;

public class Q2 {
	
	int orderId;
	String itemName;
	int quantity;
	int price=0;
	
	
	Q2(int orderId,String itemName,int quantity,int price){
		this.orderId= orderId;
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
		
	}
	Q2(int orderId,String itemName,int quantity){// over loaded constructor
		this.orderId= orderId;
		this.itemName=itemName;
		this.quantity=quantity;
		
		
	}

	public static void main(String[] args) {
		
		Q2 obj1= new Q2(1," Chiken",1,240);
		
		System.out.println("orger id : "+obj1.orderId);
		System.out.println("Item Name :"+obj1.itemName);
		System.out.println("Quantity : "+obj1.quantity);
		System.out.println("price : "+obj1.price+"\n");
		
		
		
		//---------------------------------------
		
		Q2 obj2= new Q2(1," Paneer ",1);// without taking price parameter
		
		System.out.println("orger id : "+obj2.orderId);
		System.out.println("Item Name :"+obj2.itemName);
		System.out.println("Quantity : "+obj2.quantity);
		System.out.println("price : "+obj2.price);
	}

}
