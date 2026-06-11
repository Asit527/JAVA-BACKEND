package com.kodewala.encapsulation1;

public class Fan {
	private int speedLevel=1;
	void speedChange(int speed){
	if(speed >=this.speedLevel&&speed<=5)	{
		this.speedLevel=speed;
	}
	}
public static void main(String[] args) {
	Fan obj1 = new Fan();
	obj1.speedChange(5);
	System.out.println(obj1.speedLevel);
}
}
