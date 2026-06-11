package com.p1;

public class Q6 {
	static int orderId=0;// only one copy shared among all objects
	String itemName;
	int quantity;
	int price;
	Q6(String itemName,int quantity,int price){
		orderId++;
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
		
	}

	public static void main(String[] args) {
		
		Q6 obj1= new Q6("Butter Chiken",1,240);
		
		System.out.println("orger id : "+Q6.orderId);
		System.out.println("Item Name :"+obj1.itemName);
		System.out.println("Quantity : "+obj1.quantity);
		System.out.println("price : "+obj1.price+"\n");
		
		Q6 obj2= new Q6(" paneer",1,240);
		
		System.out.println("orger id : "+Q6.orderId);
		System.out.println("Item Name :"+obj2.itemName);
		System.out.println("Quantity : "+obj2.quantity);
		System.out.println("price : "+obj2.price);
	}

}
