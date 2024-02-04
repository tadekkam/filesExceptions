package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @Test
    public void testValidatePesel() {
        Assertions.assertDoesNotThrow(() -> PeselValidator.peselValidate("12345678911"));
    }

    @Test
    public void testValidatePeselIllegalLength() {
        PeselValidator.IllegalLengthException exception = assertThrows(PeselValidator.IllegalLengthException.class,
                () -> PeselValidator.peselValidate("123"));
        assertEquals("Numer PESEL powinien mieć dokładnie 11 znaków.", exception.getMessage());
    }

    @Test
    public void testValidatePeselWrongType() {
        PeselValidator.WrongTypeOfDataException exception = assertThrows(PeselValidator.WrongTypeOfDataException.class,
                () -> PeselValidator.peselValidate("1234567891A"));
        assertEquals("Numer PESEL powinien być typu String.", exception.getMessage());
    }
}
