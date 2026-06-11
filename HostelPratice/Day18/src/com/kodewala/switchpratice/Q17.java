package com.kodewala.switchpratice;

public class Q17 {
public String printMonthName(int month) {
	
	switch (month) {
	case  1:
		return "January";
		
		
	case 2 :
		return "February";
		
		
	case 3:
		return "March";
	

	case 4:
		return "April";
	

	case 5:
		return "May";
		

	case 6:
		return "June";
		
	case 7:
		return  "July";
	
	case 8:
		return "August";
		
		
	case 9:
		return "September";
		

	case 10:
		return "October";
		

	case 11:
		return "November";
		

	case 12:
		return "December";
					

	default:
		System.out.println("Enter a valid Month.");			
		return null;
	}
	
}
	public static void main(String[] args) {
		Q17 obj1 = new Q17();
		System.out.println(obj1.printMonthName(2));

	}

}
