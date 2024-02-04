package org.example;

import java.nio.file.Files;
import java.nio.file.Path;


public class FileExampleTask2 {
    public static void filePrint(String filePath) throws Exception {

        int lineNumber = 0;
        for (String line : Files.readAllLines(Path.of(filePath))) {
            lineNumber++;
            if (lineNumber % 2 == 0) {
                System.out.println(line);
            }
        }

    }
}
