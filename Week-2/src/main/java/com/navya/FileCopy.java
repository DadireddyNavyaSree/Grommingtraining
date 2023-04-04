package com.navya;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("input.txt");
            FileOutputStream outputFile = new FileOutputStream("output.txt");

            int data;
            while ((data = inputFile.read()) != -1) {
                outputFile.write(data);
            }

            inputFile.close();
            outputFile.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

