package com.p1;

public class Q4 {
	int orderId;
	String itemName;
	int quantity=5;
	int price;
	Q4(int orderId,String itemName,int price){
		this.orderId= orderId;
		this.itemName=itemName;
		if(this.quantity>1) {
		this.quantity=1;}// only one unit approved
		this.price=price;
		
	}

	public static void main(String[] args) {
		
		Q4 obj1= new Q4(1,"Butter Chiken",240);
		
		System.out.println("orger id : "+obj1.orderId);
		System.out.println("Item Name :"+obj1.itemName);
		System.out.println("Quantity : "+obj1.quantity);
		System.out.println("price : "+obj1.price);
		
		
	}

}
