package com.navya;

import java.util.*;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // Implement the compareTo method from Comparable interface
    @Override
    public int compareTo(Person other) {
        // Compare persons based on age
        if (this.age < other.getAge()) {
            return -1;
        } else if (this.age > other.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Implement the static compare method from Comparator interface
    public static int compareByName(Person a, Person b) {
        // Compare persons based on name
        return a.getName().compareTo(b.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        Person p3 = new Person("Charlie", 20);

        // Example usage of compareTo method
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));
        System.out.println(p1.compareTo(p3));

        // Example usage of compare method
        List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3));
        Collections.sort(people, Person::compareByName);
        System.out.println(people);
    }
}

