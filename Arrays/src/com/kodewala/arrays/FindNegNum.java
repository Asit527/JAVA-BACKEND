package com.kodewala.arrays;

public class FindNegNum {

	public static void main(String[] args) {
		int arr1[]= {1,2,-1,-2,-5,-19,18,-87,-65,0,-646};
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<0){
				System.out.println(arr1[i]);
			}
		}

	}

}
