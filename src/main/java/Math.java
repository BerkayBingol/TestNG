public final class Math {

    @SuppressWarnings("unchecked")
    public static int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    @SuppressWarnings("unchecked")
    public static double divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return dividend * 1.0 / divisor;
    }
}
