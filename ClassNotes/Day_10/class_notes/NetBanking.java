class NetBanking
{
    public static void main(String args[])
    {
	  System.out.println("main() START");
      int totalBalance = NetBanking.checkBalance("1234554321"); // calling method
	   totalBalance = NetBanking.checkBalance("536566"); // calling method
	   totalBalance = NetBanking.checkBalance("744444444444444444"); // calling method
	  System.out.println("balance is "+totalBalance);
	  System.out.println("main() END");
    }
	
	public static int checkBalance(String accountNumber)
	{
		System.out.println("checkBalance() START");
		System.out.println("checking balance for "+accountNumber);
		int balance = 12000; // assume this we receive from bank database
		System.out.println("checkBalance() END");
		return balance;
	}
}