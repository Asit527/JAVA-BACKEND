package com.kodewala.stream5;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver1 {
    public static void main(String[] args) {
        String name = "bassdfrtt";

        Character result = name.chars() // Convert to IntStream
            .mapToObj(c -> (char) c)    // Convert to Stream<Character>
            .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,     // Use LinkedHashMap to preserve insertion order
                Collectors.counting()   // Count occurrences
            ))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1L) // Find entries with count of 1
            .map(entry -> entry.getKey())
            .findFirst()                // Get the first one
            .orElse(null);              // Handle cases where no unique char exists

        System.out.println("First non-repeating character: " + result);
    }
}