package com.example.util;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtilities {
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleanedInput = input.toLowerCase().chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        StringBuilder reversedInput = new StringBuilder(cleanedInput);
        reversedInput.reverse();
        return cleanedInput.equals(reversedInput.toString());
    }
}
