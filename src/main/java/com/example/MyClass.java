public class MyClass {

    public static int max(int[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("Array must not be empty to find the maximum value.");
        }
        int max = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > max) {
                max = valores[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers1 = {3, 5, 7, 2, 8};
        System.out.println("Max value: " + max(numbers1));

        int[] numbers2 = {};
        try {
            System.out.println("Max value: " + max(numbers2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}