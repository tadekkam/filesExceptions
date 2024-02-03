package org.example;

public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\data.txt";

        try {
            FileExample.filePrint(filePath);
        } catch (Exception e) {
            throw new RuntimeException(e);


        }

    }

}
