public class MyMath {

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

    public static void main(String[] args) {
        // Test cases
        System.out.println(factorial(5)); // Expected: 120
        try {
            System.out.println(factorial(-3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}