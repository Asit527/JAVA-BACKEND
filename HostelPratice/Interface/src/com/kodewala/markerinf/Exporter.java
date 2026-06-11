package com.kodewala.markerinf;
interface Exportable{}
class Document{}
class Invoice extends Document implements Exportable{}
class Draft extends Document {}

public class Exporter {
	static void export(Document d){
		if(d instanceof Exportable)
			System.out.println("Allowed");
		else
			System.out.println("Not Allowed");
	}
	public static void main(String[] args) {
		Invoice obj1 =new Invoice();
		Exporter.export(obj1);
		Draft obj2 = new Draft();
		Exporter.export(obj2);
		
		
	}
}
