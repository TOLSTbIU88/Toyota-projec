package auto;

public class StartCarException extends Exception{

    private boolean isPunctured;

    public StartCarException(boolean isPunctured) {
        this.isPunctured = isPunctured;
    }
}
