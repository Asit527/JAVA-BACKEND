// 		Modify the AddTwoNumbers program so that:
// - 	The method name is calculate
// - 	One method returns the sum
// - 	Another method returns the difference

class Q2{
	public static int calculate(String s1, String s2){

		
		return ((Integer.parseInt(s1))+(Integer.parseInt(s2)))/2;
	}

	public static int sum(String s1, String s2){

		
		return ((Integer.parseInt(s1))+(Integer.parseInt(s2)));
	}
	public static int difference(String s1, String s2){

		
		return ((Integer.parseInt(s2))-(Integer.parseInt(s1)));
	}
	public static void main(String[]args){
		System.out.println("the avg of two numbers: "+ Q2.calculate(args[0],args[1]));
		System.out.println("the sum of two numbers: "+ Q2.sum(args[0],args[1]));
		System.out.println("the difference of two numbers: "+ Q2.difference(args[0],args[1]));
	}
}