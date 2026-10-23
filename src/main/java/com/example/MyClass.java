public class MyClass {
    public static int findMax(int[] valores) {
        if (valores == null) {
            throw new IllegalArgumentException("Array cannot be null for max value calculation.");
        }
        if (valores.length == 0) {
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