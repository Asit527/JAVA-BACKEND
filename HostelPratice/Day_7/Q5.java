/*Write a program where a local variable has the same name as a class variable.
Print both and explain which one gets priority.*/

class Q5{
	int i ;
	public static void main(String[]args){
		int i =2;
		System.out.println(i);
		Q5 q5= new Q5();

		System.out.println(q5.i);

	}
}