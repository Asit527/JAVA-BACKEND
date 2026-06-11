// Write a program that:
//     - takes one command-line argument
//     - converts it to integer
//     - prints "Positive" or "Negative"

class PosNegChecking{
    public static void main(String[]args){
        int a = Integer.parseInt(args[0]);
        if(a>0){
            System.out.println(a+" is Positive");
        }
        else if(a<0 ) {
              System.out.println(a+" is Negative");
        }
    }
}