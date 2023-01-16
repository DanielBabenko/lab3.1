package org.example.Exceptions;

public class OutOfScenarioException extends Exception{
    public OutOfScenarioException(String message) {
        super(message);
    }

    public OutOfScenarioException(String message, Throwable cause) {
        super(message, cause);
    }
}
