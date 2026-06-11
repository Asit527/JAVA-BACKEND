package com.kodewala.objectcreation;


class Document{
	void printContent() {
		System.out.println( "Printing standard document...");
	}
}
class PDFDocument extends Document{
	@Override
	void printContent() {
		System.out.println("Displaying PDF with fixed layout");
	}
}

class WordDocument extends Document{
	@Override
	void printContent() {
		System.out.println( "Displaying Word text and editable tables");
	}
}

public class Printer {
	static void sendToSpooler(Document doc) {
		doc.printContent();
	}

	public static void main(String[] args) {
		
		
		
		Document obj1= new PDFDocument();
		Document obj2= new WordDocument();
		Document arr1[]= {obj1,obj2};
		
		
		
		for(Document doc:arr1) { // for each loop
			sendToSpooler(doc);
			
		}
		
		

	}

}
