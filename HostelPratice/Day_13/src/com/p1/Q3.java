package com.p1;

public class Q3 {
	int orderId;
	String itemName;
	int quantity;
	int price;
	
	Q3(int orderId,String itemName,int quantity,int price){
		this.orderId= orderId;
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
		
	}

	public static void main(String[] args) {
		
		Q3 obj1= new Q3(1,"Butter Chiken",1,240);
		
		System.out.println("orger id : "+obj1.orderId);
		System.out.println("Item Name :"+obj1.itemName);
		System.out.println("Quantity : "+obj1.quantity);
		System.out.println("price : "+obj1.price+"\n");
		
		
		
		//---------------------------------------
		Q3 obj2= new Q3(2,"Paneer Masala",1,480);
		
		System.out.println("orger id : "+obj2.orderId);
		System.out.println("Item Name :"+obj2.itemName);
		System.out.println("Quantity : "+obj2.quantity);
		System.out.println("price : "+obj2.price+"\n");
		//---------------------------------------
		
		Q3 obj3= new Q3(3,"Paneer Masala",1,480);
				
		System.out.println("orger id : "+obj3.orderId);
		System.out.println("Item Name :"+obj3.itemName);
		System.out.println("Quantity : "+obj3.quantity);
		System.out.println("price : "+obj3.price+"\n");
		//---------------------------------------
		
		Q3 obj4= new Q3(4,"Paneer Masala",1,480);
				
		System.out.println("orger id : "+obj4.orderId);
		System.out.println("Item Name :"+obj4.itemName);
		System.out.println("Quantity : "+obj4.quantity);
		System.out.println("price : "+obj4.price+"\n");
		//---------------------------------------
		Q3 obj5= new Q3(5,"Paneer Masala",1,480);
				
		System.out.println("orger id : "+obj5.orderId);
		System.out.println("Item Name :"+obj5.itemName);
		System.out.println("Quantity : "+obj5.quantity);
		System.out.println("price : "+obj5.price+"\n");
	}

}
