// Write a program that:
//     - takes two numbers from args
//     - if args are missing, print "Invalid input"
//     - else print their sum

class Q20{
    public  static void main(String[]args){
        if(args.length>=2){
            int sum= Integer.parseInt(args[0])+Integer.parseInt(args[1]);
             System.out.println(sum);
        }
        else{
            System.out.println("Invalid input");
        }
    }
    
}