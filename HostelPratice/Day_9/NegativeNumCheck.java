//  Write a program to check if a number is not negative using the '!' operator.
class NegativeNumCheck{
	public static void main(String[]args){

		int num = Integer.parseInt(args[0]); // command line argument
		boolean negStatus = num>0;
		if(negStatus != true){
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is not negative");
		}


	}

	
}