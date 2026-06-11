// Write a program to check if a student passed in at least one subject. Use '||' operator.

class StudentStatus1{
	public static void main(String[]args){

		String mathStatus = "true";
		String engStatus= "false";// i can put anything in the place of false it still consider as false.
		System.out.println("pass staus is "+(Boolean.parseBoolean(mathStatus)|| Boolean.parseBoolean(engStatus)));

	}
	
}