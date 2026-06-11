package com.kodewala.objectcreation;
class Notification{
	  void send() {
		
	}
}

class EmailNotification extends Notification{
	@Override
	 void send() {
		System.out.println("Alert Send by Email");
		}
}

class SMSNotification extends Notification{
	@Override
	 void send() {
		System.out.println("Alert Send by SMS");
		}
}

public class NotificationService {
	static void  pushAlert(Notification n) {
		n.send();
	}
	public static void main(String[] args) {
		Notification obj1= new EmailNotification();
		Notification obj2= new SMSNotification();
		pushAlert(obj1);
		pushAlert(obj2);

	}

}
