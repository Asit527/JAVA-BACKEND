package com.kodewala.abstrctclass;
interface BankAPI {
    void transfer();
    default void audit() { }
}
public class Q5  implements BankAPI {
public void transfer() { //code wont break because audit() is already implemented
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
