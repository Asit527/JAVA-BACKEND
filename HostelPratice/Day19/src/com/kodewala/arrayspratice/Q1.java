package com.kodewala.arrayspratice;

public class Q1 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8,9};
		int even=0;
		for (int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				even++;
			}
			
		}
		System.out.println(even);
		System.out.println(arr1.length-even);
	}

}
