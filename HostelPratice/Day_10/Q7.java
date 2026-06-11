// Write a program where:
//    - main reads two numbers using Scanner
//    - Passes them to an instance method
//    - The instance method prints their sum
import java.util.Scanner;
class Q7{
  public void sum(int num1, int num2){

    System.out.println(num1+num2);
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter First Number : ");
    int num1= sc.nextInt();
    System.out.print("Enter First Second : ");
    int num2= sc.nextInt();
    Q7 q= new Q7();
    q.sum(num1, num2);


  }
}