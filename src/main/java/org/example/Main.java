package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "d:\\data.txt";
        String text = "Kurs" + "\n" + "Java" + "\n" + "Lekcja 6" + "\n" + "Pliki" + "\n" + "Wyjątki"
                + "\n" + "Pliki" + "\n" + "Koniec pliku";
        Files.writeString(Path.of(filePath), text);
    }
}