package com.example.util;

public class StringUtility {
    private static String cleanInput(String input) {
        return input.replaceAll("[\W_]+", "").toLowerCase();
    }

    private static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleanedInput = cleanInput(input);
        return cleanedInput.equals(new StringBuilder(cleanedInput).reverse().toString());
    }
}
