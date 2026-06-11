package com.kodewala.overloading;

public class StringManipulator {
	String formatText(String text) {
		return text.toUpperCase();
	}
	 String formatText(String text, String tag) {
	        return "[" + tag + "] " + text;
	    }
	 String formatText(String text, int times) {
		 String str="";
		 for(int i=0;i<times;i++) {
	      str=  str+text;
	        }
		 return str;
	    }
	public static void main(String[] args) {
		StringManipulator obj1 = new StringManipulator();
		String vaue1= obj1.formatText("Asit");
		System.out.println(vaue1);
		String vaue2= obj1.formatText("Asit","Name");
		System.out.println(vaue2);
		String vaue3= obj1.formatText("Asit",3);
		System.out.println(vaue3);
	}

}
