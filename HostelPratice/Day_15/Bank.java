public class Bank {

    String branch;
    String ifscCode;
    int balance;
    Bank(String branch,String ifscCode,int balance){
        this(  balance);
        this.branch=branch;
        this.ifscCode=ifscCode;
       

    }
    Bank(int balance){
        this.balance=balance;

    }

}
