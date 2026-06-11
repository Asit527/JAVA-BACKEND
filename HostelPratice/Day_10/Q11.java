//  Write a program that reads first name and last name using Scanner and prints:
// Full name: <first> <last>
import java.util.Scanner;
class Q11{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name : ");
		String first= sc.next();
		System.out.print("Enter last name : ");
		String last= sc.next();
		System.out.println("Full name : "+first+" "+last);

	}
}