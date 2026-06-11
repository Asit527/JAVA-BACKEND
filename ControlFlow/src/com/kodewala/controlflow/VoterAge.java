package com.kodewala.controlflow;

public class VoterAge {

	public static void main(String[] args) {
		
		int[] ages = {21, 25, 30, 18, 12, 27, 35, 24, 29, 20};
		for(int i=0;i<ages.length;i++) {
			if(ages[i]<18) {
				System.out.println("Invalid voter list at array index: "+i);
				break;
			}
		}

	}

}
