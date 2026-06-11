public class Q1{
    String name;
    int roll;

    Q1(String name,int roll){
        this.name=name;
        this.roll=roll;

        
    }
    


    public static void main(String[] args) {
     Q1 obj1= new Q1("Asit", 0);
     System.out.println("Name: "+obj1.name);
     System.out.println("roll no: "+obj1.roll);

        
    }

    
}