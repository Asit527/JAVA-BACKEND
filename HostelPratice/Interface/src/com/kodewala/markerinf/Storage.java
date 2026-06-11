package com.kodewala.markerinf;

interface Persistable  {

}

class UserProfile implements Persistable {
}

class SessionCache {
}

public class Storage {
	static void save(Object o) {
		if (o instanceof Persistable)
			System.out.println("allowed");
		else
			System.out.println("not allowed");
	}

	public static void main(String[] args) {
		Persistable obj1 =new UserProfile();
		save(obj1);
		SessionCache obj2 =new SessionCache();
		save(obj2);
		

	}

}
