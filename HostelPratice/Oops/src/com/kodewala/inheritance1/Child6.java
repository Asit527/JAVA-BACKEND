package com.kodewala.inheritance1;
class Parent6{
	final void  show() {
		System.out.println("Parent method running");
		
	}
}
public class Child6 extends Parent6{
	void  show() { // cant overide bcz parent method is final and we are doing method overriding
		System.out.println("Parent method running");
		
	}
	public static void main(String[] args) {
		Child6 obj1= new Child6();
		obj1.show();
	}

}
