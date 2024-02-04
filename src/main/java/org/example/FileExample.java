package org.example;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {

    public static void fileNumberOfCharacters (String filePath) throws Exception {

        String text = Files.readString(Path.of(filePath));

        System.out.println(text.length());
    }

}