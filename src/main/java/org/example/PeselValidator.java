package org.example;

public class PeselValidator {

    public static class WrongTypeOfDataException extends Exception {
        public WrongTypeOfDataException(String message) {
            super(message);
        }
    }

    public static class IllegalLengthException extends Exception {
        public IllegalLengthException(String message) {
            super(message);
        }
    }

    public static boolean peselValidate(String pesel) throws WrongTypeOfDataException, IllegalLengthException {

        if (!(pesel instanceof String)) {
            throw new WrongTypeOfDataException("Numer PESEL powinien być typu String.");

        }

        if (pesel.length() != 11) {
            throw new IllegalLengthException("Numer PESEL powinien mieć dokładnie 11 znaków.");
        }
        return true;
    }
}