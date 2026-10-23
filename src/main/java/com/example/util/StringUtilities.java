package com.example.util;

public class StringUtilities {
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.toLowerCase().chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversedInput);
    }
}
