package com.example.util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtilities {
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.toLowerCase().chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        return cleanedInput.equals(cleanedInput.chars()
                .mapToObj(i -> (char) i)
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }
}
