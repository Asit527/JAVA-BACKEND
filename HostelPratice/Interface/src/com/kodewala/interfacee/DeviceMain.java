package com.kodewala.interfacee;
interface USBDevice{
	public void connect();
}
class  Keyboard  implements USBDevice{
	@Override
	public void connect() {
		System.out.println("Keyboard Connecteed");
	}
}
class  Mouse  implements USBDevice{
	@Override
	public void connect() {
		System.out.println("Mouse Connected");
	}
}
public class DeviceMain {
	void plugIn(USBDevice d){
		d.connect();
	}
	public static void main(String[] args) {
		USBDevice obj1 = new Keyboard();
		USBDevice obj2 = new Mouse();
		
		//annonomus object
		new DeviceMain().plugIn(obj1);
		new DeviceMain().plugIn(obj2);
		

	}

}
