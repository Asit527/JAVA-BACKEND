public class Student extends Object {
    String name;
    int rollNo;

    Student(){
        super();
        
    }
    Student(String name){
        this("Asit",1);
       

     
    }
 
    Student(String name,int rollNo){
        this();
        this.name=name;
        this.rollNo=rollNo;
    }
    
    public static void main(String[]args){
        Student obj1= new Student("Asit");
        System.out.println(obj1.name+"\n"+obj1.rollNo);

    }
    
}
