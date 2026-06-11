// Declare static and instance variables with different values and print them.

class Q18{
	 int minAge=18;
	 static int maxAge=60;
	public static void  main(String[] args){
		
		Q18 obj1 = new Q18();

		System.out.println("Minimum age limit : "+obj1.minAge);
		System.out.println("Maxium age limit : "+Q18.maxAge);

	}
}