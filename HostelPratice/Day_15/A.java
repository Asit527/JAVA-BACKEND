public class A {
    A(){super();
        System.out.println("A starts"); // this runs first bcz java dont waant to know who cal first rather than it check what need to build first
        
    }
}
class B extends A{
B(){super();
    System.out.println("B starts");
}
}

class C extends B{
    C(){
        super();
        System.out.println("C starts");

    }
public static void main(String[] args) {
    C obj1 = new C();
    
}
}