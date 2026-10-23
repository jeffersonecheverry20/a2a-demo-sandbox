public class StringUtils {
    /**
     * Checks if the given string is a palindrome, ignoring case, spaces, and punctuation.
     */
    public static boolean isPalindrome(final String input) {
        // If input is null, return false as per the acceptance criteria
        if (input == null) {
            return false;
        }
        
        // Normalize the input by removing non-alphanumeric characters and converting to lower case
        final String normalized = input.replaceAll("[\W_]+", "").toLowerCase();
        
        // Check if the normalized string is a palindrome
        final int length = normalized.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}