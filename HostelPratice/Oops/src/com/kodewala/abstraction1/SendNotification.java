package com.kodewala.abstraction1;
abstract class Notification{
	  String content;
	abstract  void send();
	public Notification(String content) {
		this.content=content;
	}
}
class EmailNotification extends Notification{
	
	@Override
 void send(){
		
		System.out.println(content);
	}
	EmailNotification(String content){
		super(content);
		
	}
	
	
	
}
class SMSNotification extends Notification{
	@Override
 void send(){
		
		System.out.println(content);
	}
	SMSNotification(String content){
		super(content);
		
	}
	
	
}


class PushNotification extends Notification{
	@Override
 void send(){
		
		System.out.println(content);
		
		
	}
	 PushNotification(String content){super(content);}
 
	
}
public class SendNotification {
	public static void main(String[] args) {
		Notification obj1 = new EmailNotification("Welcome to our service");
		Notification obj2 = new SMSNotification("Your OTP is 4582");
		Notification obj3 = new PushNotification("You have a new alert");
		
		obj1.send();
		obj2.send();
		obj3.send();
		
		
	}

}
