public class User {
    String name;
    int age;
    User(String name){
        this.name=name;
    }
    User(int age){
        this.age=age;
        super();// compile time error
    }

        public static void main(String[] args) {
            
        }
    
}
