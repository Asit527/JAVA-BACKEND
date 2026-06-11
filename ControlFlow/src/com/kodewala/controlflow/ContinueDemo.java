package com.kodewala.controlflow;

public class ContinueDemo {

	public static void main(String[] args) {
		int validStudent=0;
		String[] students = {
			    "Aarav", "Ishaan", null, "Arjun", "Sai",
			    "Reyansh", "Kabir", "Aditya", null, "Rohan"
			};
		
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null) {
				validStudent++;
				
				
				
			}
			else {
				System.out.println("invalid name found");
				continue;
			
			}
		}
		System.out.println(validStudent);
		
		


	}

}
