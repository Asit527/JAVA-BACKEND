// Change the value of a static variable twice inside main() and print the final value.

class Q19{
	 
	 static int age=10;
	public static void  main(String[] args){
	Q19.age=20;
	Q19.age=30;

		
		System.out.println("Maxium age limit : "+Q19.age);

	}
}