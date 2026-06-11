package com.kodewala.markerinf;
interface Transmittable{}
class Packet {}
class LogEntry implements Transmittable{}
public class Network {
	static void send(Object o){
		if (o instanceof Transmittable)
			System.out.println("allowed");
		else
			System.out.println("not allowed");
	}
	public static void main(String[] args) {
		Packet obj1 = new Packet();
		LogEntry obj2 = new LogEntry();
		Network.send(obj1);
		Network.send(obj2);
	}

}
