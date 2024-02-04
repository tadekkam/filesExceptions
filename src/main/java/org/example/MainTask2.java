package org.example;

public class MainTask2 {

    public static void main(String[] args) {

        String filePath = "D:\\data.txt";

        try {
            FileExampleTask2.filePrint(filePath);
        } catch (Exception e) {
            throw new RuntimeException(e);


        }

    }

}
