class AddTwoNumbers{
	public static  int add(int num1, int num2){
		return num1+num2;
	}
	public static void main(String[]args){

		

		int totalBalance = AddTwoNumbers.add(Integer.parseInt(args[0]),Integer.parseInt(args[1]));// calling methiod 

		System.out.println("your total balance is :"+ totalBalance);
	}
	
}