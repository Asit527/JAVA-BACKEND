package com.p1;

 class Customerrr {
    String name;
    String email;

    Customerrr(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

public class Order {
	
	Customerrr customerrr;
	
	  Order(Customerrr customerrr) {  // 
	        this.customerrr = customerrr;
	    }

	
	
	public static void main(String[] args) {
		Customerrr c = new Customerrr("Asit Kumar Nayak", "asitkumarnayak630@gmail.com");
		Order o = new Order(c);
		System.out.println(o.customerrr.name);
	}

}



//// dought
