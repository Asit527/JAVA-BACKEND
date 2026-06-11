// Write a program to determine if a power supply is available AND iron is present, then print "Start ironing".

class Ironing{
	public static void main(String[]args){

	String ironPresentStatus= "tRue"; // it is consider as true
	String electricityPresentStatus= "true";
	
	System.out.println("ironing status is "+(Boolean.parseBoolean(ironPresentStatus) && Boolean.parseBoolean(electricityPresentStatus)));

	}
}
