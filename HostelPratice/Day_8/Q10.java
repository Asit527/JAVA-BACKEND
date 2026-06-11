/* Try accessing an instance variable directly inside main() without an object.
    (Observe the compiler error.) */
    class Q10{
	int age;
	public static void  main(String[] args){
		System.out.println(age);

	}
}