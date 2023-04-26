package com.navya.singleton;

import java.io.*;

public class TestSerialization {
    public static void main(String[] args) throws IOException , ClassNotFoundException , FileNotFoundException {

        Serialization serialization1 = Serialization.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\dadnavya\\GrommingTraining\\Design-patttern\\src\\main\\java\\com\\navya\\singleton\\serialization.ser")));
        oos.writeObject(serialization1);

        Serialization serialization2 =null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\dadnavya\\GrommingTraining\\Design-patttern\\src\\main\\java\\com\\navya\\singleton\\serialization.ser")));
        serialization2 = (Serialization) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(serialization1 == serialization2);
    }
}
