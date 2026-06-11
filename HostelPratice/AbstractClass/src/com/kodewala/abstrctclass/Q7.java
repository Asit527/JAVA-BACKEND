package com.kodewala.abstrctclass;
abstract class Test{
	int x;
	abstract void pay();
	Test(int x ){
		super();
		this.x=x;
	}
}
class Q7 extends Test {
	Q7(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	@Override
	void pay() {
		System.out.println("paying amount: "+x);
	}
	public static void main(String[] args) {
		Test obj1 = new Q7(1);
		obj1.pay();
		
	}
}
