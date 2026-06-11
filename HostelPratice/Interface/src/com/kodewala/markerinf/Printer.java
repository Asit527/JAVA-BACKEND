package com.kodewala.markerinf;
interface Printable{}
class Report implements Printable{}
class AudioClip{}
public class Printer {
	static void print(Object o){
		if(o instanceof Printable)
			System.out.println("Printing");
		else
			System.out.println("cant print , invalid format");
	}
	public static void main(String[] args) {
		Report obj1 = new Report();
		Printer.print(obj1);
		AudioClip obj2 = new AudioClip();
		Printer.print(obj2);
		
	}
	

}
