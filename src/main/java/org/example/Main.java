package org.example;
public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\data.txt";
        String fileOutputPath = "D:\\output.txt";

        try {
            FileExample.changeToUpperCase(filePath, fileOutputPath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
}