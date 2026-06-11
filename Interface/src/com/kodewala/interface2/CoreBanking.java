package com.kodewala.interface2;

interface IBank{
	void transferFund();
	void transferTxb();
	void setLimit();
	public  default void printPassbook() {} // newly added
	 // default is not not accesses modifier
	//backward compatibility
	public  static void  smsAlert() { // for removing code duplicacy
		System.out.println("IBank.smsAlert()");
		
	}
}



class HDFC implements IBank{
	@Override
	public void transferFund() {}
	@Override
	public void transferTxb() {}
	@Override
	public void setLimit() {}
	
}
class IDFC implements IBank{
	public void transferFund() {}
	public void transferTxb() {}
	public void setLimit() {}
	
}
class UCO implements IBank{
	@Override
	public void transferFund() {}
	@Override
	public void transferTxb() {}
	@Override
	public void setLimit() {}
	
}
class SBI implements IBank{
	@Override
	public void transferFund() {}
	@Override
	public void transferTxb() {}
	@Override
	public void setLimit() {}
	
}

class RuralBank implements IBank{
	@Override
	public void transferFund() {}
	@Override
	public void transferTxb() {
		IBank.smsAlert();
	}
	@Override
	public void setLimit() {}
	@Override
	public  void printPassbook() {
		// default method
		
		System.out.println("default method -- for backward compatibility");
	} 
	
}


public class CoreBanking {

	public static void main(String[] args) {
		RuralBank  obj1 = new RuralBank();
		obj1.printPassbook();

	}

}
