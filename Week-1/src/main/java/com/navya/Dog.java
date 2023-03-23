package com.navya;

// Dog.java
public class Dog extends Animal {
    public void accessParentFieldsAndMethods() {
        System.out.println(publicField); // Can access public field
        System.out.println(protectedField); // Can access protected field
        System.out.println(defaultField); // Can access default field
//         System.out.println(privateField); // Cannot access private field

        publicMethod(); // Can access public method
        protectedMethod(); // Can access protected method
        defaultMethod(); // Can access default method
//         privateMethod(); // Cannot access private method
    }
}
