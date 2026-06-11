/*Write a program where a local variable is declared but not initialized and try to print it.
👉 Observe and note the compiler error.*/

class Q2{

	public static void main(String[]args){
		int i;// compile time error because wendont intilize variable and try to use it

		System.out.println(i);
	}
}