// Write a program that:
//     - reads two integers using Scanner
//     - passes them to a static method
//     - the method returns their difference
//     - print the result in main
import java.util.Scanner;
    class Q17{
        public static int difference(int a , int b){
            return a-b;
        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.close();
            int diffValue= Q17.difference(a,b);
            System.out.println(diffValue);


        }

    }