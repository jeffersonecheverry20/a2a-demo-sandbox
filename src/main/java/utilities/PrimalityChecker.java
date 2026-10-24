package utilities;

/**
 * Utility class for primality checks.
 */
public final class PrimalityChecker {

    private PrimalityChecker() {
        // utility class, not instantiable
    }

    /**
     * Indicates whether the given integer is prime.
     *
     * @param n the integer to test
     * @return true if n is prime; false for every n < 2 and for composite numbers
     */
    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= n / i; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Self-checking tests using only the JDK. Throws AssertionError on failure.
     */
    public static void main(String[] args) {
        int[] nonPrimes = {Integer.MIN_VALUE, -7, -1, 0, 1, 4, 6, 9, 15, 25, 49};
        for (int n : nonPrimes) {
            check(!esPrimo(n), "expected non-prime: " + n);
        }

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 97, 7919};
        for (int n : primes) {
            check(esPrimo(n), "expected prime: " + n);
        }

        check(esPrimo(2147483647), "expected prime: 2147483647");
        check(!esPrimo(2147483646), "expected non-prime: 2147483646");

        System.out.println("All PrimalityChecker tests passed.");
    }

    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
