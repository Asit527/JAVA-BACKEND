package com.delivery;


public class PublicAcess {
	

	public static void main(String[] args) {
		System.out.println(PublicAcessIn.x);
		PublicAcessIn.add();
		

	}

}

class PublicAcessIn {
	 public static  int x =5;
		
		public static void add() {
			System.out.println("this method adds two numbers");
		}
		
}
