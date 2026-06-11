package com.kodewala.switchpratice;

public class TrafficLight {

	public static void main(String[] args) {
		String a = "Yellow";
		switch (a) {
		case "Red":
			System.out.println("Red – Stop 🚫");

			break;
		case "Yellow":
			System.out.println("Yellow – Caution / Prepare to stop ⚠");
			break;
		case "Green":
			System.out.println("Green – Go 🟢");
			break;

		default:
			System.out.println("Enter a valid Colour");
			break;
		}

	}

}
