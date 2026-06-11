// Write a program that:
//     - reads name and age using Scanner
//     - passes them to a method
//     - the method prints the message

import java.util.Scanner;
class UserDetails{
    public void messagePrinter(String name, int age){

System.out.print("Your name:  "+name+"\n"+"your age : "+age+"\n");
}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine(); 
        System.out.print("Enter your age : "); 
        int age= sc.nextInt();
        UserDetails uD= new UserDetails();
        uD.messagePrinter(name,age);
        sc.close();


    }

    
}