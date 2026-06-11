//Declare a local variable inside main() and explain why it cannot be accessed in another method.

class Q14{
	public static void main(String[]args){
	int i =1;
	run();
	}
	void run(){
	System.out.println(i);// we cant acess i by this way beause ibis local to main method only
	}
}