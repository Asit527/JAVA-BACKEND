package com.kodewala.interfacee2;

public interface Logger3 {
	 void log(String msg);
	 static void prefix(String level,String msg) {
		 
	 }
	 default void  logInfo(String msg) {
		 prefix("","");
	 }
}
