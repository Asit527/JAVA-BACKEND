// Write a program that:
//    - Takes two numbers from command-line arguments
//    - Uses a method findMax(int a, int b)
//    - Prints which number is bigger

   class Max{
      public int findMax(int a, int b){
         if(a>b){
            return a;
         }
         else{
            return b;
         }
         
      }

      public static void main(String[]args){

         int a=Integer.parseInt(args[0]);
         int b= Integer.parseInt(args[1]);
         Max m = new Max();
         System.out.println("value of max number is "m.findMax(a,b));





      }
   }