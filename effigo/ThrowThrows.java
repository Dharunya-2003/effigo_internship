package effigo;

public class ThrowThrows {
    public static void checkNumber(int num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative!");
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
