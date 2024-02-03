package org.example;

import java.nio.file.Files;
import java.nio.file.Path;


public class FileExample {
    public static void filePrintReverse(String filePath) throws Exception {

        int lineNumber = 0;
        int lineCount = (int) Files.lines(Path.of(filePath)).count();

        String[] lines = new String[lineCount];

        for (String line : Files.readAllLines(Path.of(filePath))) {
            lines[lineNumber++] = line;
        }

        for (int i = lines.length -1; i >= 0; i--) {
            System.out.println(lines[i]);
        }

    }
}

