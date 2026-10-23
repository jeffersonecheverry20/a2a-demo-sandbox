public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        String normalized = normalizeInput(input);
        return isStringPalindrome(normalized);
    }

    private static String normalizeInput(String input) {
        return input.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
    }

    private static boolean isStringPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}