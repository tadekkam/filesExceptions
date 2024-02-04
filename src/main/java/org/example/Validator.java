package org.example;

public class Validator {
    public void validate(int[] values) {
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException("Liczba " + value + " nie jest podzielna przez 3");
                }
                System.out.println("Liczba " + value + " jest podzielna przez 3");
            } catch (IllegalArgumentException e) {
                System.out.println("Błąd walidacji: " + e.getMessage());
            }
        }
    }

}
