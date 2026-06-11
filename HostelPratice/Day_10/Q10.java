// Write a program that takes two command-line arguments, converts them to integers, and prints their product using a static method.

class Q10{
	public static void product (String a, String b){
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		System.out.println(num1*num2);


	}
	public static void main(String[]args){

		Q10.product(args[0],args[1]);

	}
}