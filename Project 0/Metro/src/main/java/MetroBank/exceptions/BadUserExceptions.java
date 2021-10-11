package MetroBank.exceptions;

public class BadUserExceptions extends Exception {

    public BadUserExceptions(String message) {
        super(message);
    }


    public BadUserExceptions() {
        super("Bruh, you cant do that here");

    }
}
