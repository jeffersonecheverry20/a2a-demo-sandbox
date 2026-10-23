package com.example.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtility {
    private static String cleanInput(String input) {
        return Arrays.stream(input.toLowerCase().split(""))
                .filter(c -> !isPunctuation(c) && !Character.isWhitespace(c))
                .collect(Collectors.joining());
    }

    private static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleanedInput = cleanInput(input);
        return cleanedInput.equals(reverse(cleanedInput));
    }

    private static boolean isPunctuation(char c) {
        List<Character> punctuations = Arrays.asList('!', '"', '#', '$', '%', '&', ''', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\', ']', '^', '_', '`', '{', '|', '}', '~');
        return punctuations.contains(c);
    }

    private static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}