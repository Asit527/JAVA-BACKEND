package com.kodewala.typecasting;

public class Main8 {
public static void main(String[] args) {
	Integer[] intArray = new Integer[5];

    // 2. Upcast it to an Object array (This is allowed)
    Object[] objArray = intArray;

    System.out.println("Upcast successful. Array type: " + objArray.getClass().getSimpleName());

    try {
        // 3. Try to store a String into the Integer array via the Object reference
        objArray[0] = "Hello World"; 
    } catch (ArrayStoreException e) {
        System.out.println("CAUGHT: ArrayStoreException!");
        System.out.println("Reason: The actual array in memory is Integer[], not Object[].");
    }
}
}

// dought