package ex;

public class NumberTooLowException extends Exception {

    private final int minValue;

    public NumberTooLowException(String message, int minValue) {
        super(message);
        this.minValue = minValue;
    }

    public int getMinValue() {
        return minValue;
    }
}
