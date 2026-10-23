public class MyClass {
    public static int max(int[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty for max value calculation.");
        }
        int max = valores[0];
        for (int value : valores) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}