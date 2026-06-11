//  Write a program to check if a number is between 10 and 20 (inclusive).

class InclusiveCheck{
	public static void main(String[]args){
	int num = Integer.parseInt(args[0]);
	System.out.println(num>=10 && num<=20);
	}
}