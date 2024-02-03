package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PeselValidatorTest {

    @Test
    void peselValidate() {
        Assertions.assertEquals(true, PeselValidator.peselValidate("11111111111"));
    }
}