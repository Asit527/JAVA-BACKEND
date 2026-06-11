 // Write a program to check if a 'balance' is sufficient for a transfer. Input balance and transfer amount. Output "Transfer Successful" or "Insufficient Balance".

 class BalanceCheck{
public static void main(String[]args){
	int balance = 10000 , transferAmount = 200;
	System.out.println("transfer status : " + (balance>=transferAmount));
 }}
