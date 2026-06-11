class DLCheck
{

   public static void main(String args[])
   {
   
    System.out.println(" My DLCheck!!!");
	
	String input = args[0]; // Type of string --> "34" --> convert to int 34
	
	int age = Integer.parseInt(input);
	
	int maxAge = 60;
    int minAge = 18;
	
	System.out.println(  ((age > minAge ) || (age < maxAge)) ); 
	
	
   }


}