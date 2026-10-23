public class MyMath {
    
    /**
     * Calculates the factorial of a non-negative integer n.
     * Throws IllegalArgumentException if n is negative.
     * @param n the input number
     * @return the factorial of n
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * Test class for MyMath.factorial method.
     */
    public static class FactorialTest {
        @org.junit.jupiter.api.Test
        public void testFactorial() {
            assertEquals(120, factorial(5));
            try {
                factorial(-3);
                fail("Expected IllegalArgumentException for negative input");
            } catch (IllegalArgumentException e) {
                assertEquals("Input must be non-negative", e.getMessage());
            }
        }
    }
}
