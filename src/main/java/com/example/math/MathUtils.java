public class MathUtils {

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
    public static void main(String[] args) {
        System.out.println(factorial(5)); // Expected: 120
        try {
            System.out.println(factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Expected: Input must be a non-negative integer
        }
    }
}