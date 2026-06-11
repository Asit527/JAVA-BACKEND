public class Account {
    int accountNumber;
    int  balance;
    String  type;
    Account( int accountNumber){
        this(12345,1232445676);
    }
    Account( int accountNumber,int  balance){
        this(12345,1232445676,"Individual");
    }
    Account( int accountNumber,int  balance,String  type){
        super();
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.type=type;

    }
    public static void main(String[] args) {
        Account obj1= new Account(1);
        
    }

}
