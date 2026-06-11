package com.kodewala.inheritance2;
class Swiggy{
	public void showInfo(int userId) //overridden method
	{
		System.out.println("This is Swiggy class method");
	}
}
class User extends Swiggy{
  @Override // annotation
	public  void showInfo(int userId) // overriding method
	{
		System.out.println("This is User class method");
	}
}
public class Order extends User {

	public static void main(String[] args) {
		User obj1= new User();
		obj1.showInfo(1);
		
	}

}

//tightly coupled