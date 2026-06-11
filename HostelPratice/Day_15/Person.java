public class Person {
    String name;
    int  age;
    Person(){
        this("Asit",22);

    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Person obj1= new Person();
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }

    
}
