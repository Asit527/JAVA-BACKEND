 // Create a class User with instance variables:
 //   - name
 //   - email
 //   Create a method setDetails(String name, String email) using this keyword.

   class User{
   	String name;
   	String email;
   	void setDetails(String name, String email){
   		this.name = name;
   		email = email;
   		System.out.println(name+" "+email);

   	}


public static void main(String[]args){
User u = new User();
u.setDetails("Asit","asitkumarnayak630@gmail.com");
   }
}
