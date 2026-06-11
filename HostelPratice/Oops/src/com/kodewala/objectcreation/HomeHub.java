package com.kodewala.objectcreation;

class SmartDevice {
	public void turnOn() {
		
	}

}
class SmartBulb extends SmartDevice{
	@Override
public void turnOn() {
		System.out.println("Bulb activated");
	}

	
	
}
class SmartThermostat extends SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("Thermostat   activated");
		}
}
public class HomeHub{
	public static void activateDevice(SmartDevice device) {
		device.turnOn();
	}
	public static void main(String[] args) {
		SmartDevice obj1 = new SmartBulb();
		SmartDevice obj2 = new SmartThermostat();
		activateDevice(obj1);
		activateDevice(obj2);
		
		
	}
	
}
