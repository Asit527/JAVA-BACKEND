package com.kodewala.arrayspratice;

public class SecondLargest {

	public static void main(String[] args) {
		int arr1[]= {111,1,-8,11,3,4,5,6,7,8,9,10,11};
		int firstLargest=arr1[0];
		
		int secondLargest=0;
		
		for(int i=1;i<arr1.length;i++) {
			
			if(arr1[i]>secondLargest) {
				secondLargest=firstLargest;
				firstLargest=arr1[i];
				
			}
			
		}
		System.out.println("First Largest: "+firstLargest);
		System.out.println("Second Largest: "+secondLargest);

	}

}
		//dought