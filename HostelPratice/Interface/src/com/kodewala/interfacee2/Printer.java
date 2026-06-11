package com.kodewala.interfacee2;

public interface Printer {
public abstract void print();
public default void  scan() {} // no compile error bcz 
}
class  OldPrinter implements Printer{
	@Override
	public  void print() {}
}