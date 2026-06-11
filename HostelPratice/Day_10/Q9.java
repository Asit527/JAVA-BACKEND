// Write a program that:
//    - Accepts command-line arguments
//    - If arguments are missing, prints: "Please provide input"
//    - Otherwise performs addition

   class Q9{
   public static void main(String[]args){
      int totalAdd=0;// total sum value
      int argsLength =args.length; // no. of command kine arguments
      if(argsLength>=1){
         for(int i =0;i<argsLength;i++){
            totalAdd= totalAdd+Integer.parseInt(args[i]);
         }
      }
      else{
         System.out.println("Please provide input");
      }
      System.out.println(totalAdd);

   }
   }