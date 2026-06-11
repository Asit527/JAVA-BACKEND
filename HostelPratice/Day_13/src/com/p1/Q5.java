package com.p1;

public class Q5 {
	int orderId;
	String itemName;
	int quantity;
	int price;
	Q5(int orderId,String itemName,int quantity,int price){
		this.orderId= orderId;
		this.itemName=itemName;
		if(quantity>1) {// only one Quantity allowed
		this.quantity=1;
		}
		 if(price>0) {// for free order
		this.price=0;	
		}
		
		
	}

	public static void main(String[] args) {
		
		Q5 obj1= new Q5(101,"Butter Chiken",2,240);
		
		System.out.println("orger id : "+obj1.orderId);//101
		System.out.println("Item Name :"+obj1.itemName);//butter chiken
		System.out.println("Quantity : "+obj1.quantity);//1
		System.out.println("price : "+obj1.price);//0
		
		
	}

}
