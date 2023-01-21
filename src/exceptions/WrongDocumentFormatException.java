package exceptions;

public class WrongDocumentFormatException extends Exception{
    public WrongDocumentFormatException(String message) {
        super(message);
    }
}
