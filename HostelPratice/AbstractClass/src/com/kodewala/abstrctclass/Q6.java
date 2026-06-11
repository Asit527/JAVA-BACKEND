package com.kodewala.abstrctclass;
interface Loggerr{
	default void log() { }
}

abstract class Loggerrr {
    abstract void log(); // compulsory  give implement if abstract
}
public class Q6  extends Loggerrr{

	@Override
	void log() {
		// TODO Auto-generated method stub
		
	}

}
