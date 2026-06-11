package com.kodewala.stream4;

import java.util.List;

public class Driver3 {
	public static void main(String[] args) {
		String s2="swiss";
	List<Character>output=s2.chars().mapToObj(e->(char)e).filter(e->s2.indexOf(e)==s2.lastIndexOf(e)).toList();


	}

}
