package org.example;

public class MainTask3 {
    public static void main(String[] args) {

        String filePath = "D:\\data.txt";

        try {
            FileExampleTask3.fileNumberOfCharacters(filePath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}