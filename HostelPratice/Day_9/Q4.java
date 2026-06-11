 // Can you assign a double value to an int variable directly? Why or why not?

class Q4{
	public static void  main(String[] args) {
		double x = 198.6;
		int y =(int)x; // explicit type casting
		System.out.println(y); // incompatable type error 
	}
}