package com.example;

import java.util.Locale;

/**
 * Checks if a given string is a palindrome, ignoring case, spaces, and punctuation.
 * @param input the string to check
 * @return true if the input is a palindrome based on the specified criteria, false otherwise
 */
public class StringHelper {
    /**
     * Checks if a given string is a palindrome, ignoring case, spaces, and punctuation.
     * @param input the string to check
     * @return true if the input is a palindrome based on the specified criteria, false otherwise
     */
    public static boolean isPalindrome(String input) {
        String filtered = input.toLowerCase(Locale.ROOT).replaceAll("\\W+", "");
        StringBuilder sb = new StringBuilder(filtered);
        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}