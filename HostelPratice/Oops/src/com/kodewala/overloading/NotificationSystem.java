package com.kodewala.overloading;

public class NotificationSystem {
	void sendNotification(String username) {
		System.out.println("NotificationSystem.sendNotification(String username)");
	}
void sendNotification(long phoneNum) {
System.out.println("NotificationSystem.sendNotification(long phoneNum)");
		
	}
void sendNotification(String email, int priorityLevel) {
	System.out.println("NotificationSystem.sendNotification(String email, int priorityLevel)");
}

	public static void main(String[] args) {
		NotificationSystem obj1 = new NotificationSystem();
		obj1.sendNotification("as__it");
		obj1.sendNotification(7609035868l);
		obj1.sendNotification("asitkumarnayak630@gmail.com",1);
	}

}
