package org.example;

public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\data.txt";

        try {
            FileExample.filePrintReverse(filePath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
