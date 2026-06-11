public class Company {
    String name;
    int totalEmployee;
    int  totalValuation;
    Company(String name,int totalEmployee , int totalValuation){
        this(totalValuation);
        this.name=name;
        this.totalEmployee=totalEmployee;

    }
    Company(int totalValuation){
        this.totalValuation=totalValuation;
    }
public static void main(String[] args) {
    Company obj1= new Company("Apple", 10000, 99999990);
    System.out.println(obj1.totalValuation);
}
    
}
