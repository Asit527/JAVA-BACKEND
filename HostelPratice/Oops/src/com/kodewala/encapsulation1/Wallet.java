package com.kodewala.encapsulation1;

public class Wallet {
private int money;
void addMoney(int money) {
	this.money=money;
}
	public static void main(String[] args) {
		Wallet obj1= new Wallet();
		System.out.println(obj1.money);
		obj1.addMoney(111);
		System.out.println(obj1.money);

	}

}
