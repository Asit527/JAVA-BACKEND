package com.kodewala.interfacee;
interface BankAccount{
	void deposit();
	void withdraw();
}
class SavingsAccount implements BankAccount{
	@Override
	public void deposit() {}
	@Override
	public void withdraw() {}
}
public class CurrentAccount implements BankAccount  {
	@Override
	public void deposit() {}
	@Override
	public void withdraw() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
