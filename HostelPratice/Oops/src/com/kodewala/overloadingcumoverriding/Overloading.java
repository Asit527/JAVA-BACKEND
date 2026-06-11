package com.kodewala.overloadingcumoverriding;
class Parent3{ // we don't need inheritance  / is a relationship  / extends
	//v1
	void show(int i) {
		System.out.println("v1");
	}
	//v2
	void show(int i,int j) {
		System.out.println("v2");
	}
	//v3
		void show(int i,String j) {
			System.out.println("v3");
		}
		
		//v4
				public void show(String i,String j) {
					System.out.println("v4");
				}
		

				//v5
						public void show(Object i,String j) {
							System.out.println("v5");
						}
				
								

						//v6
								public String show(Object i,int j) {
									System.out.println("v6");
									return new String();
								}
						
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
