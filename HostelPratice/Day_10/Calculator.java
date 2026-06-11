// Create a class Calculator with:
//    - An instance method multiply(int a, int b)
//    - Call this method from main using an object
//    - Take input using Scanner
   import java.util.Scanner;
   class Calculator{
      public int mul(int a , int b){
         return a*b;
      }
      public static void main(String[]args){
         Calculator cal = new Calculator();

         Scanner sc = new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         
         System.out.println(cal.mul(a,b));



      }
   }