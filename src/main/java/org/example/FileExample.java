package org.example;

import java.nio.file.Files;
import java.nio.file.Path;


public class FileExample {

    public static void changeToUpperCase(String filePath, String fileOutputPath) throws Exception {

        String text = Files.readString(Path.of(filePath));
        text = text.toUpperCase();

        Files.writeString(Path.of(fileOutputPath), text);

    }

}