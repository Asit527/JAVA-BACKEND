package com.kodewala.interfacee2;

public interface Logger2 {
public static String format(String level,String msg) {
	return "["+level+"]"+msg;
}
}
