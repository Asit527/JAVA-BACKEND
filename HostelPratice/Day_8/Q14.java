// Declare a local variable with the same name as a static variable. Print both values.
  
  class Q14{
  	static int age =10;
	
	public static void  main(String[] args){
		int age =20;
		System.out.println(Q14.age);
		System.out.println(age);

	}
}