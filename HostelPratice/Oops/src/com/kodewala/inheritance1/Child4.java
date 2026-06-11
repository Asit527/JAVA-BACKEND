package com.kodewala.inheritance1;
class Parent4{
	void run() {
		System.out.println(" parent running");
	}
}
public class Child4 extends Parent4 {
	void run() {
		System.out.println(" child running"); // this will run
	}
	public static void main(String[] args) {
	Parent4 obj1= new Child4();
	obj1.run();

	}

}
