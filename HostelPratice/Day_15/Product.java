public class Product extends Object{

    int productId;
    int price;
    Product(  int productId, int price){
        super();// obj class have no arg contructor
        this.productId=productId;
        this.price=price;

        

    }
    
}
class Electronics extends Product{
    Electronics(){
        super(11,11000);
    }
    public static void main(String[] args) {
        Electronics obj1= new Electronics();
        System.out.println(obj1.productId);
        System.out.println(obj1.price);

        
    }

}
