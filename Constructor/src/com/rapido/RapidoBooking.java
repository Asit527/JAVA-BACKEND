package com.rapido;

public class RapidoBooking {
	String source;
	String destination;
	int fare;
	String bookingType;
	RapidoBooking(String source,String destination,int fare){
		this.source=source;
		this.destination=destination;
		this.fare=fare;
		
	}
	RapidoBooking(String source,String bookingType){
		this.source=source;
		
		this.bookingType=bookingType;
	}
	
	public static void main(String[] args) {
		RapidoBooking obj1= new RapidoBooking("BTM Layout","Silk Board",300);
		RapidoBooking obj2= new RapidoBooking("BTM Layout","Corporate");
		// only creating objects
	}

}
