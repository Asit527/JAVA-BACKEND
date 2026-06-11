package com.p1;
class OrderInfo{
	
	int orderId;
	String orderName;
	float gst;
	int price;
	
	OrderInfo(int _orderId,String _orderName,int _price){
		this.orderId=_orderId;
		this.orderName=_orderName;
		this.gst=(_price/100)*18;// always becareful during  /	
		this.price=_price;
	}
	
}
public class Invoice {
	OrderInfo orderInfo;
	Invoice(OrderInfo orderInfo){
		this.orderInfo=orderInfo;
	}
	public static void main(String[] args) {
		OrderInfo obj1= new OrderInfo(1,"Iphone 17 pro",99990);
		Invoice obj2 = new Invoice(obj1);
		
		System.out.println("Order Id : "+obj2.orderInfo.orderId);
		System.out.println("Order Name : "+obj2.orderInfo.orderName);
		System.out.println("Order Gst : "+obj2.orderInfo.gst);
		System.out.println("Order Price : "+obj2.orderInfo.price);
		
		

	}

}
