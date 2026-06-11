package com.amazon;

public class AmazonOrders {

	public static void main(String[] args) {
		
		AmazonOrdersInnerr c1= new AmazonOrdersInnerr(1,"packed","phone",1,100);
		AmazonOrdersInnerr c2= new AmazonOrdersInnerr(1,"packed","phone",1,100);
		AmazonOrdersInnerr c3= new AmazonOrdersInnerr(1,"packed","phone",1,100);
		AmazonOrdersInnerr c4= new AmazonOrdersInnerr(1,"packed","phone",1,100);
		AmazonOrdersInnerr c5= new AmazonOrdersInnerr(1,"packed","phone",1,100);
		System.out.println(c1.orderId+" "+ c1.orderStatus+" "+c1.item+" "+c1.qty+" "+c1.price);
		
	}

}

