package com.kodewala.exception3;

public class FundTransfer {
	int finalBalance=1000;
	void doTransfer(int amount)  throws UserAlreadyRegistredException
	// user have tp write try catch to resolve this exception
	{
		if(amount>10000)
			throw new UserAlreadyRegistredException("Dont have amount");
		// creating new obj of exception
		else
			System.out.println("doing transfer");
	}

}
