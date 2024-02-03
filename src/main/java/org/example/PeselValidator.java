package org.example;

public class PeselValidator {

    class WrongTypeOfDataException extends Exception {
        public WrongTypeOfDataException(String message) {
            super(message);
        }
    }
    class IllegalLengthException extends Exception {
        public IllegalLengthException(String message) {
            super(message);
        }
    }

    public static boolean peselValidate(String pesel) {

    }
}
