package com.kodewala.encapsulation1;

public class Tv {
private int volume;
void increaeVolume() {
	volume++;
}
void decreaseVolume() {
	volume--;
}

	public static void main(String[] args) {
		Tv obj1 = new Tv();
		obj1.increaeVolume();
		obj1.increaeVolume();
		System.out.println(obj1.volume);
		obj1.decreaseVolume();
		System.out.println(obj1.volume);

	}

}
