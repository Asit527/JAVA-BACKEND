//Write a program that takes three command-line arguments and prints the largest number using a method.

class LargestAmongThree{
	public static void main(String[]args){

		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int third = Integer.parseInt(args[2]);
		if(first>second && first>third){
			System.out.println("first is largest");
		}
		else if(second>first && second> third){
			System.out.println("second is largest");
		}
		else if(third>first && third > second){
			System.out.println("third is largest");
		}
		else{
			System.out.println("more than 2 value have same value");
		}
	}
}