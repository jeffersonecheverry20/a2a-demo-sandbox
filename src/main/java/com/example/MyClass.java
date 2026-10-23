public class MyClass {

    public static int max(int[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty for max value calculation.");
        }
        int max = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > max) {
                max = valores[i];
            }
        }
        return max;
    }
}