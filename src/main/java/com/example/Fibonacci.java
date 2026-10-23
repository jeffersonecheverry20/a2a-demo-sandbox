public class Fibonacci {

    /**
     * Computes the n-th Fibonacci number iteratively. Returns -1 for negative n.
     * @param n the position in the Fibonacci sequence
     * @return the n-th Fibonacci number or -1 if n is negative
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10)); // 55
        System.out.println(fibonacci(-1)); // -1, n < 0, invalid input
        System.out.println(fibonacci(0));  // 0
        System.out.println(fibonacci(1));  // 1
        System.out.println(fibonacci(15)); // 610
    }
}