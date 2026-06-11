public class Teacher {
    String name;
    int id;
    Teacher(String name, int id){
        this(id);
        this.name=name;
    }
    Teacher(int id){
        this.id=id;
    }
    public static void main(String[] args) {
        Teacher obj1= new Teacher("x",1);
        System.out.println(obj1.id);
    }

    
}
