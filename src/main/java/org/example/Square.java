package org.example;

public class Square {

    public static double calculateSquare(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej.");
        }
        return Math.sqrt(number);
    }
}
