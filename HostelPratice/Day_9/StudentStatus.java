// Write a program to check if a student passed in both subjects. Use '&&' operator.

class StudentStatus{
	public static void main(String[]args){

		String mathStatus = "true";
		String engStatus= "true";
		System.out.println("pass staus is "+(Boolean.parseBoolean(mathStatus)&& Boolean.parseBoolean(engStatus)));

	}
	
}