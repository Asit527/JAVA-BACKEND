package com.kodewala.exception3;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourdes {
public static void main(String[] args) {
	try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){ // try eith resources
		// auto cloasbale
	}
	catch(Exception e) {}
}

}
