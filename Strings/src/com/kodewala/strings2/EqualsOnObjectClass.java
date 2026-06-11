package com.kodewala.strings2;
class Carr{
	String s;

	Carr(String S){
		this.s=s;
	
}
}

public  class EqualsOnObjectClass {
	public static void main(String[] args) {
		Carr obj1= new Carr("ccc");
		Carr obj2= new Carr("ccc");
		System.out.println(obj1==obj2);
	}

}
