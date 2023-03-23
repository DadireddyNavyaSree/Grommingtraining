package com.navya;

// Animal.java
public class Animal {
    public String publicField = "I am public";
    protected String protectedField = "I am protected";
    String defaultField = "I am default (package-private)";
    private String privateField = "I am private";

    public void publicMethod() {
        System.out.println("I am a public method");
    }

    protected void protectedMethod() {
        System.out.println("I am a protected method");
    }

    void defaultMethod() {
        System.out.println("I am a default (package-private) method");
    }

    private void privateMethod() {
        System.out.println("I am a private method");
    }
}
