package org.example;

import java.nio.file.Files;
import java.nio.file.Path;


public class FileExample {

    public static boolean isTextInFile(String filePath, String textFind) throws Exception {

        String text = Files.readString(Path.of(filePath));
        text = text.toUpperCase();
        textFind = textFind.toUpperCase();

        if (text.contains(textFind)) {
            return true;
        }
        return false;

    }

}