package com.kodewala.interface1;

interface IPayment {
	void payment();

	void stopPayment();
}

class Centralbank implements IPayment {
	@Override
	public void payment() {
	}

	@Override
	public void stopPayment() {
	}
}

class SBIBank implements IPayment {
	@Override
	public void payment() {
	}

	@Override
	public void stopPayment() {
	}
}

class HDFCBank implements IPayment {
	@Override
	public void payment() {
	}

	@Override
	public void stopPayment() {
	}
}

class IDFCBank implements IPayment {
	@Override
	public void payment() {
	}

	@Override
	public void stopPayment() {
	}
}

class PNBBank implements IPayment {
	@Override
	public void payment() {
	}

	@Override
	public void stopPayment() {
	}
}

class VCO implements IPayment {
	@Override
	public void payment() {
	}

	@Override
	public void stopPayment() {
	}
}

class RuralBank implements IPayment {
	@Override
	public void payment() {
	}

	@Override
	public void stopPayment() {
	}
}

public class PaymentProcessor1 {

	public static void main(String[] args) {
		IPayment obj1 = new Centralbank(); // for central bank

	}

}
