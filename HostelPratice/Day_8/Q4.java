//Change the value of a static variable inside main() and print the updated value.

class Q4{
	static int minAge=18;
	public static void  main(String[] args) {
		System.out.println("Before Changing : "+Q4.minAge);
		Q4.minAge++;

		System.out.println("After Changing : "+Q4.minAge);
		
	}
}