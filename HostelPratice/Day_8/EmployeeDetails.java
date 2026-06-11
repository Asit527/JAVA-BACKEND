// Write a program where a static variable companyName is shared by 3 employee objects. Print it from each object.
class EmployeeDetails{
  static String companyName = "Apple";
 public static void main(String[]args){
 	System.out.println("employee 1 Company Name : "+EmployeeDetails.companyName);
 	System.out.println("employee 1 Company Name : "+EmployeeDetails.companyName);
 	System.out.println("employee 1 Company Name : "+EmployeeDetails.companyName);



 }

	
}