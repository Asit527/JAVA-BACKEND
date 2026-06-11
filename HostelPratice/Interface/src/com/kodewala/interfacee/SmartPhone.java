package com.kodewala.interfacee;
interface Camera {
	void takePhoto();
}
interface MusicPlayer {
	void playMusic();
}
public class SmartPhone implements Camera,MusicPlayer{
	@Override
	public void takePhoto() {
		System.out.println("photo capture");
	};
	@Override
	public void playMusic() {
		System.out.println("music playing");
	};
	public static void main(String[] args) {
		SmartPhone obj1 = new SmartPhone();
		obj1.playMusic();
		obj1.takePhoto();

	}

}
