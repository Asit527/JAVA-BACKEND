/*Can a local variable be static?
Write a program to test this and note the compiler message.*/
class Q9{
public static  void showDetails(int age , String name){
	int localAge= age;
	String localName= name;

	System.out.println("Age : "+localAge);
	System.out.println("Name : "+localName);

}
	public static void main(String[]args){
	showDetails(22,"Asit");


	}
}