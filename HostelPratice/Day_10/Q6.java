 // Modify a Scanner-based program so that:
 //   - Input logic stays in main
 //   - Output logic is moved to a method:
 //     void displayDetails(String name, String email)
 //     
import java.util.Scanner;
class Q6{
  public void displayDetails(String name, String email){

    System.out.println("your name is "+name+" and your mail id is "+email);
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Name : ");
    String name= sc.next();
    System.out.print("Enter your  Email id : ");
    String email= sc.next();
    Q6 q= new Q6();
    q.displayDetails(name, email);


  }
}