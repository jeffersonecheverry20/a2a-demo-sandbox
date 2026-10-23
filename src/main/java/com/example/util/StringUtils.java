package com.example.util;

import java.util.Arrays;
import java.util.List;

public class StringUtils {

    public static boolean isPalindrome(String input) {
        String filtered = filterNonAlphanumeric(input.toLowerCase());
        int left = 0;
        int right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static String filterNonAlphanumeric(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "");
    }
}
