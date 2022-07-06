package auto;

public class StartCarException extends Exception{

    private boolean isPunctured;

    public StartCarException(String message, boolean isPunctured) {
        super(message);
        this.isPunctured = isPunctured;
    }
}
