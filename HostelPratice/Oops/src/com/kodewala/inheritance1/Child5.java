package com.kodewala.inheritance1;
class Parent5{
	private int x=5;// only we can acess using getter and seeter
}
public class Child5 extends Parent5 {
	
	public static void main(String[] args) {
	Child5 obj1= new Child5();
	//System.out.println(obj1.x);
	
	
	Parent5 obj2= new Parent5();
	//System.out.println(obj2.x);
	

	}

}
