package ex;

public class CustomExceptionsMain {
    public static void main(String[] args) throws NumberTooLowException {
        int input = 2;
        try {
            method1(input);
        } catch (NumberTooLowException e) {
            method1(e.getMinValue());
        }
        try {
            method2(input);
        } catch (NumberTooLowException e) {
            method2(e.getMinValue());
        }
    }

    public static void method1(int i) throws NumberTooLowException {
        // in specs gasim ca numarul minim e 7
        if (i < 7) {
            throw new NumberTooLowException("Number is too low", 7);
        } else {
            System.out.println("SUCCESS!");
        }
    }


    public static void method2(int i) throws NumberTooLowException {
        // in specs gasim ca numarul minim e 15
        if (i < 15) {
            throw new NumberTooLowException("Number is too low", 15);
        } else {
            System.out.println("SUCCESS!");
        }
    }
}
