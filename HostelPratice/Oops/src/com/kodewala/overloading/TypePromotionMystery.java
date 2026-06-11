package com.kodewala.overloading;

public class TypePromotionMystery {
void show(int a) {
	System.out.println(a);
}
void show(double a) {
	
}
	public static void main(String[] args) {
		TypePromotionMystery obj1 = new TypePromotionMystery();
		obj1.show('A');// auto type convo

	}

}
