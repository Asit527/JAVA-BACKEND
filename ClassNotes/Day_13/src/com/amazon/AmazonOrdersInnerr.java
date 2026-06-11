package com.amazon;

public class AmazonOrdersInnerr {
	int orderId;
	String orderStatus;
	String item;
	int qty;
	int price;
	
	AmazonOrdersInnerr(int _orderId,String _orderStatus,String _item,int _qty,int _price){
		
		 orderId=_orderId;
		 orderStatus =_orderStatus;
		 item=_item;
		 qty=_qty;
		 price=_price;
	}

}
