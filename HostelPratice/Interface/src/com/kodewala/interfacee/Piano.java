package com.kodewala.interfacee;
interface Playable{
	void play();
}
 class Guitar implements Playable {

	@Override
	public void play() {
		System.out.println("Guitar playing");
		
	}
	Guitar(){
		super();
	}

	

}

public class Piano implements Playable {

	@Override
	public void play() {
		
		System.out.println("piano playing");
	}
	void perform (Playable p){
		p.play();
	}
	Piano(){
		super();
	}

	public static void main(String[] args) {
		Piano obj1= new  Piano();
		obj1.perform(obj1);

	}

}
