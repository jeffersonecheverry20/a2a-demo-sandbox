public class MathUtils {
    
    /**
     * Computes the factorial of a non-negative integer n.
     * @param n the non-negative integer whose factorial is to be computed
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Unit tests
    public static void testFactorial() {
        assert factorial(5) == 120 : "Factorial of 5 should be 120";
        assert factorial(0) == 1 : "Factorial of 0 should be 1";
        try {
            factorial(-1);
            assert false : "Expected IllegalArgumentException for negative input";
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Input must be a non-negative integer") : "Exception message should match";
        }
    }
}