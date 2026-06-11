package com.kodewala.controlflow;

public class DivisibleBy4 {

	public static void main(String[] args) {
		int totalNum=0;
		for(int i=1;i<=20;i++) {
			if(i%4==0) {
				totalNum++;
			}
		}
		System.out.println(totalNum);

	}

}
