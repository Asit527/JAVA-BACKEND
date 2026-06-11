

class A20 {
    static { System.out.println("A-SIB"); }
    { System.out.println("A-IIB"); }
    A20() { System.out.println("A-Cons"); }
}

public class Q20 {
    public static void main(String[] args) throws Exception {
        Class.forName("A20"); // load class Q20 if we are in default package
    }
}

//