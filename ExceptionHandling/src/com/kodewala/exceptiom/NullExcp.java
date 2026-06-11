package com.kodewala.exceptiom;

public class NullExcp {

public static void main(String[] args)  {
	System.out.println("start of main()");
	String s=null; // no obj created
	System.out.println(s.length());//. dot operator
	System.out.println("end of main()");
}
}
//What is a Stack Trace?
//When an exception occurs, Java prints a stack trace — it shows you what went wrong and where it went wrong (which class, method, line number).