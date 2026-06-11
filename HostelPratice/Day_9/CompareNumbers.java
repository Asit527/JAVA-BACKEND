// Write a Java program to compare two numbers and print the larger one.

class CompareNumbers{
	public static void main(String[]args){

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if(a>b){
			System.out.println("1st is greter than 2nd ");
		}
		else if(a<b){
			System.out.println("1st is lesser than 2nd");
		}
		else{
			System.out.println("both are equal");
		}

	}
	
}