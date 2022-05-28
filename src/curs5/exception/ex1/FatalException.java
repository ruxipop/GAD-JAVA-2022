package curs5.exception.ex1;

public class FatalException extends RuntimeException {
    public FatalException() {
        super("No way from here");
    }
}
