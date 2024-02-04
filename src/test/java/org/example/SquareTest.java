package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void calculateSquare() {
        Assertions.assertEquals(4, Square.calculateSquare(16));
    }

    @Test
    void calculateSquareZero() {
        Assertions.assertEquals(0, Square.calculateSquare(0));

    }

    @Test
    public void calculateSquareNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Square.calculateSquare(-9));
    }
}