public class Employee {
    int id;
    String name;
    int salary;
    Employee(int id){
        this(0,null);
    }
    Employee(int id , String name){
        this(1,"Asit",2000000);
    
    }
    Employee(int id , String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

        
    }
    public static void main(String[] args) {
        Employee obj1 = new Employee(0);

        System.out.println(obj1.id);
        System.out.println(obj1.name);
        System.out.println(obj1.salary);
    }

        
            
}
