package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User1  {
	private int id;
	private boolean isActive;

	User1(int id, boolean isActive) {
		this.id = id;
		this.isActive = isActive;
	}

	public boolean getStatus() {
		return isActive;
	}
	public int getId() {
		return id;
	}

}

public class ActivateUser {
	public static void main(String[] args) {
		List<User1> users = Arrays.asList(new User1(1, true), new User1(2, false));
		System.out.println(users.stream().filter(e -> e.getStatus() == true).map(e->e.getId()).collect(Collectors.toList()));
	}
}
