package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @Test
    public void testValidatePesel() {
        assertDoesNotThrow(() -> PeselValidator.peselValidate("12345678911"));
    }

    @Test
    public void testValidatePeselIllegalLength() {
        PeselValidator.IllegalLengthException exception = assertThrows(PeselValidator.IllegalLengthException.class,
                () -> PeselValidator.peselValidate("1234567890"));
        assertEquals("Numer PESEL powinien mieć dokładnie 11 znaków.", exception.getMessage());
    }
}
