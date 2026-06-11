package com.flipkart;


public class Order {
	
	int  orderId;
	int customerId;
	String customerName;
	String productName;
	int quantity;
	String status;
	
	Order(){
			// Default Constructor
	}
	Order(int  orderId,int customerId,String customerName,String productName,int quantity,String status){
		
		this.orderId=orderId;
		this. customerId=customerId;
		this.customerName=customerName;
		this.productName=productName;
		this.quantity=quantity;
		this.status=status;
		//Custom  Constructor
		
		
	}
	
	
	public static void main(String[] args) {
		Order cust1=new Order(1,10,"Asit","Phone",1,"Packed");
		Order cust2=new Order(2,10,"Asit","Phone",1,"Packed");
		Order cust3=new Order(3,10,"Asit","Phone",1,"Packed");
		Order cust4=new Order(4,10,"Asit","Phone",1,"Packed");
		Order cust5=new Order(5,10,"Asit","Phone",1,"Packed");
		Order cust6=new Order(6,10,"Asit","Phone",1,"Packed");
		Order cust7=new Order(7,10,"Asit","Phone",1,"Packed");
		Order cust8=new Order(8,10,"Asit","Phone",1,"Packed");
		Order cust9=new Order(9,10,"Asit","Phone",1,"Packed");
		Order cust10=new Order(10,10,"Asit","Phone",1,"Packed");
		
	}

}
