package com.kodewala.marinfpratice;

public class Copy {
	
public void copy(Object o) {
	if(o instanceof Copyable)
		System.out.println("copyable");
	else
		System.out.println("not copyable");
}


}
