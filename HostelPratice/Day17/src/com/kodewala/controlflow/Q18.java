package com.kodewala.controlflow;

public class Q18 {

	public static void main(String[] args) {
		int i;
		int j;
		for( i=1;i<=3;i++) {
			for( j=1;j<=3;j++) {
				
				if(i!=j) {
					System.out.println(i+" "+j);
					
				}
				else {
					 continue; // skip to next iteration
				}
				
			}
			
			
		}

	}

}
