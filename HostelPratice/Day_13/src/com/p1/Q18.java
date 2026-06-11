package com.p1;

public class Q18 {
    String name;
    int roll_No;
    Q18(String name){
        
        this(12);
        this.name=name;
    }
    Q18(int roll_No){
        
       this.roll_No=roll_No;
       

    }
        public static void main(String[] args) {
            Q18 obj1= new Q18("Asit");
            System.out.println(obj1.roll_No);
            System.out.println(obj1.name);
        }

}
