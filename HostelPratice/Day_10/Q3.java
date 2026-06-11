 // Write a program that uses Scanner to read:
 //   - Name
 //   - Age
 //   - City
 //   Then print:
 //   Hello <name>, you are <age> years old and live in <city>.
import java.util.Scanner;
class Q3{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Name : ");
    String name= sc.next();
    System.out.print("Enter your Age : ");
    int age= sc.nextInt();
    System.out.print("Enter your city : ");
    String city= sc.next();
    System.out.print("Hello "+name+", you are "+age+" years old and live in "+city+".\n");
  }
}