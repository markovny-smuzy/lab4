package Exceptions;

import java.io.IOException;

public class SnusmumrikIsNotInTheTentException extends IOException {
    public SnusmumrikIsNotInTheTentException(String message) {
        super(message);
    }
}
