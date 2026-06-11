// Write a program where two objects have different values for the same instance variable.

class Q8{
	int age;
	public static void  main(String[] args){

	Q8 obj1= new Q8();
	Q8 obj2= new Q8();

	obj1.age=10;
	obj2.age=20;

	System.out.println(obj1.age);
	System.out.println(obj2.age);

	}
}