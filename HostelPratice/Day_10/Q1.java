// Write a Java program that takes three command-line arguments, converts them into integers, and prints their average using a separate static method.

class Q1{
	public static int threeAvg(String s1, String s2,String s3){

		
		return ((Integer.parseInt(s1))+(Integer.parseInt(s2))+(Integer.parseInt(s3)))/3;
	}
	public static void main(String[]args){
		System.out.println("the avg of three numbers: "+ Q1.threeAvg(args[0],args[1],args[2]));

	}
}