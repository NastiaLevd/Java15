package org.example;

public class InvalidHotelDataException extends RuntimeException {
    public InvalidHotelDataException(String message) {
        super(message);
    }
}
