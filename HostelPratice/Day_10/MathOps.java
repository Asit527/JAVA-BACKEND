 // Create a class MathOps with:
 //    - an instance method add(int a, int b)
 //    - call it from main using an object
 //    - take input using Scanner

import java.util.Scanner;
class MathOps{
	public void add(int a , int b){
		System.out.println("addition of two variables : "+(a+b));
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first value : ");
		int a = sc.nextInt();

		System.out.print("Enter Second value : ");
		int b = sc.nextInt();

		sc.close();
		MathOps mO= new MathOps();
		mO.add(a,b);
		


	}
	
}