// Create a class Student with instance variables:
//     - name
//     - rollNo
//     Create a method setStudent(String name, int rollNo) using this keyword.
class Student{
    String name;
    int rollNo;
    public void setDetails(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;

    }
    public static void main(String[]args){
        Student s = new Student();
        s.setDetails("Asit kumar nayak", 1);
        System.out.println(s.name);
        System.out.println(s.rollNo);
    }
    
}