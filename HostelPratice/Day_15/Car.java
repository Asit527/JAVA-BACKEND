public class Car {
    String brand; // instance variable beolongs to object
    int speed;    // instance variable beolongs to object
    Car(){
        this("BMW",299);
    }
    Car( String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    public static void main(String[] args) {
        Car obj1= new Car();

        System.out.println(obj1.brand);
        System.out.println(obj1.speed);
    }
    
}
