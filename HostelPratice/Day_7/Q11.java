//Declare two local variables and swap their values using a third local variable.
class Q11{
	public static void main(String[]args){
		int i =1;
		int j=2;
		System.out.println("before swap i : "+i);
		System.out.println("before swap j : "+j);

		int k= i;
		i=j;
		j=k;
		System.out.println("after swap i : "+i);
		System.out.println("after swap j : "+j);



	}
}