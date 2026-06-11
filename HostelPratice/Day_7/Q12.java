//Declare two local variables and swap without using a third variable.
class Q12{
	public static void main(String[]args){
		int i =1;
		int j=2;

		System.out.println("before swap i : "+i);
		System.out.println("before swap j : "+j);

		i=i+j;//2
		j=i-j;
		i=i-j;

		System.out.println("after swap i : "+i);
		System.out.println("after swap j : "+j);
	}
}