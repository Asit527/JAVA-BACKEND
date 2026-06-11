// Write a program to check if a person is eligible to vote (age ≥ 18).

class AgeCheck{
	public static void main(String[]args){
	int age = Integer.parseInt(args[0]);
	System.out.println("voting status: "+(age>=18));
	}
}