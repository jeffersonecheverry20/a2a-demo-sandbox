public class StringUtils {

    public static boolean isPalindrome(final String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        final String normalized = input.replaceAll("[\W_]+", "").toLowerCase();
        final int length = normalized.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}