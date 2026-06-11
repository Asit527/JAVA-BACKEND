package com.delivery;

public class OrderDetails {

	public static void main(String[] args) {
		
		String itemName= args[0];
		int orderId=Integer.parseInt(args[1]);
		
		System.out.println("Item Name : "+itemName);
		
		System.out.println("Order id :"+ orderId);

	}

}
