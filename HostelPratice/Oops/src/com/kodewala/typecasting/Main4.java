package com.kodewala.typecasting;

interface GPS { // Interface
	void findLocation(); // abstract methods
}

interface Radio {
	void playMusic();
}

 class SmartCar implements GPS, Radio { // smart car 
	@Override
	public void findLocation() {
		System.out.println("finding loaction");

	}

	@Override
	public void playMusic() {
		System.out.println("palying music");
	}

	

}
 
public class Main4{ 
	public static void main(String[] args) {
		GPS obj1 = new SmartCar();
		obj1.findLocation(); //finding location
		Radio obj2 = (Radio)obj1;
		obj2.playMusic(); // Playing music
	}
	
}
 
