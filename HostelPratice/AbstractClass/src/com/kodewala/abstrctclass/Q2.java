package com.kodewala.abstrctclass;
interface Logger{
	static void  prefix() {
		System.out.println("Connected to db");
	}
}
class AppLogger implements Logger{
	AppLogger.prefix(); // bcz static  method belongs to the class it defined
}
public class Q2 extends AppLogger {

	public static void main(String[] args) {
		

	}

}
