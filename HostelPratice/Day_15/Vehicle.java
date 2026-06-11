public class Vehicle {
    String vechileType;
    int wheels;
    Vehicle(String vechileType,int wheels){
        this.vechileType=vechileType;
        this.wheels=wheels;
    }
    

}
class Bike extends Vehicle{
    String colour;
    int price;


    Bike(String colour,int price){
        super("Private",2);
        this.colour=colour;
        this.price=price;



    }
    public static void main(String[] args) {
        Bike obj1=new Bike("Black",3000000);
        System.out.println(obj1.vechileType);
        System.out.println(obj1.wheels);
        System.out.println(obj1.colour);
        System.out.println(obj1.price);
        
    }

}
