package com.kodewala.controlflow;

public class BreakStatement {

	public static void main(String[] args) {
		int i=100;
		for(;;i--) {
			if(i==5) {
				break;
			}
			else {
				System.out.print(i+" ");
			}
		}

	}

}
