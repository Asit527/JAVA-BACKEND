package com.kodewala.markerinf;

interface Deletable {
}

class TempFile implements Deletable {
}

class SystemConfig {
}

public class Cleaner {
	static void remove(Object o) {
		if(o instanceof Deletable)
			 System.out.println("Deletion allowed");
		else
			   System.out.println("Deletion blocked");
			
	}

	public static void main(String[] args) {
		TempFile obj1 = new TempFile();
		Cleaner.remove(obj1);
		SystemConfig obj2 = new SystemConfig();
		Cleaner.remove(obj2);
		
		// i dont want anyone to delete expect admin so i don't implement
		
		
	}

}
