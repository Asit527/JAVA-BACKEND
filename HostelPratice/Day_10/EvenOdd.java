//Write a program that reads an integer using Scanner and prints whether it is even or odd using a separate method.
import java.util.Scanner;

class EvenOdd{
	public  void check(int num){
		if(num%2==0){
			System.out.println(num+" is even.");
		}
		else{
			System.out.println(num+" is odd.");
		}
		}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		EvenOdd eO= new EvenOdd();
		eO.check(num);

	}
}