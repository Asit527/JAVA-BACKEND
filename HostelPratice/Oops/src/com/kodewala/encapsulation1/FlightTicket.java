package com.kodewala.encapsulation1;

public class FlightTicket {
	private int seatNumber=0;
	
		void setSeatNUmber(int num) {
			if(this.seatNumber==0&& num>0) {
				this.seatNumber=seatNumber+num;
				System.out.println(this.seatNumber);
			}
		}	
	
	
	public static void main(String[] args) {
		FlightTicket obj1= new FlightTicket();
		obj1.setSeatNUmber(12);

	}

}
