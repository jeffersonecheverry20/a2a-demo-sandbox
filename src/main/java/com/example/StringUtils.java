public class StringUtils {
    
    /**
     * Checks if the given string is a palindrome, ignoring case, spaces, and punctuation.
     * @param input the string to check
     * @return true if the input is a palindrome under the specified conditions, false otherwise
     */
    public static boolean isPalindrome(final String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        if (input.isEmpty()) {
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
