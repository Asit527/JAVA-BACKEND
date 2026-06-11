package com.kodewala.arrayspratice;

public class LargestSmallest {

	public static void main(String[] args) {
		int arr1[]= {13,2,3,4,500,-100,6,7,8,9};
		int largest=0,smallest=0;
		 
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>=largest) {
				largest=arr1[i];
			}
			else if(arr1[i]<=smallest) {
				smallest=arr1[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

}
