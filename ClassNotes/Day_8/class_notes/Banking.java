class NetBanking
{
    static int intRate=5;
    int balance; // instance variable OR Object specific 
	 public static void main(String []args)
	 {
        System.out.println(" Rate of interest is :::: "+NetBanking.intRate);
		
		NetBanking user1 = new NetBanking(); // one object created
		user1.balance = 100;
		
		
		NetBanking user2 = new NetBanking(); // one object created
		user2.balance = 1200;
		
		System.out.println(" user 1 balance "+user1.balance);
		System.out.println(" user 2 balance "+user2.balance);
	 }

}