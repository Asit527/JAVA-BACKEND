package com.kodewala.map1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Student implements Comparable<Student> {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

public class TreeMapDemo1 {
    public static void main(String[] args) {

        Map<Integer, Student> treeMap = new TreeMap<Integer, Student>();

        treeMap.put(1, new Student("Asit"));
        treeMap.put(1, new Student("Alok")); // overwrites "Asit" for key 1
        treeMap.put(2, new Student("Asit"));
        treeMap.put(3, new Student("Alok"));

        Set<Entry<Integer, Student>> entrySet = treeMap.entrySet();
        Iterator<Entry<Integer, Student>> itr1 = entrySet.iterator();

        while (itr1.hasNext()) {
            Entry<Integer, Student> entry = itr1.next();
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value.name);
        }
    }
}