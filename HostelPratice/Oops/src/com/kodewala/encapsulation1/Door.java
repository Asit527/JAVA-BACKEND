package com.kodewala.encapsulation1;

public class Door extends Object {
	boolean isLocked;
	void lock() {
		this.isLocked=true;
	}
	void unLock() {
		this.isLocked=false;
	}
	public static void main(String[] args) {
		Door obj1= new Door();
		System.out.println(obj1.isLocked);// default
		obj1.lock();// lock
		System.out.println(obj1.isLocked);
		obj1.unLock(); // unlock
		System.out.println(obj1.isLocked);
	}

}
