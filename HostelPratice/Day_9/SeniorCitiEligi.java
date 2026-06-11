// Write a program to check if a person is eligible for a senior citizen discount. Age should be >= 60 OR have a special membership.

class SeniorCitiEligi{
	public  static void main(String[]args){
		int age = 50;
		boolean specialStatus = true;

		System.out.println("senior citizen status: "+(age>=60|| specialStatus== true));
	}
}