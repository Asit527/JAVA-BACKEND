package com.kodewala.switchpratice;

public class Q20 {
public Q20() {
	super();
}
public void skipMultiples(int a) {
	for(int i=1;i<=40;i++) {
		if(i%6!=0) {
			System.out.println(i);
		}
		else continue;
	}
}
	public static void main(String[] args) {
		Q20 obj1= new Q20();
		obj1.skipMultiples(6);
		

	}

}
