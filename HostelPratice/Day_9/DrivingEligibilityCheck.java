// Create a program to check if a person can drive a car: They must have a license AND be at least 18 years old OR be accompanied by an adult.
class DrivingEligibilityCheck{
   public static void main(String[]args){
      boolean haveDl = true;
      int age = 18;
      boolean accompainedByAdult = false;

      System.out.println(haveDl==true &&(age>=18||accompainedByAdult==true));
      


   }
}