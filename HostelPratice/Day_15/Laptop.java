public class Laptop {
    int price;
    boolean status;
    Laptop(String productName,int price){
        this(price);

    }
    Laptop(int price){
        if(price<100){// here price is the parametrized value
            this.status=true;
        }

    }
    public static void main(String[] args) {

        Laptop obj1= new Laptop("Choclate",100);
        System.out.println(obj1.status);

        Laptop obj2= new Laptop("Choclate",99);
        System.out.println(obj2.status);

        
        
    }
}
