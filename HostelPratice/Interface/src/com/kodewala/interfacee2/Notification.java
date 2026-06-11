package com.kodewala.interfacee2;

public interface Notification {
void send();
public default void schedule() {
	
} // backward compatibility
}

class EmailNotification implements Notification{
	public void send() {
		System.out.println("Sending email..");
	}
	
}
