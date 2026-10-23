package com.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringUtil {
    public static boolean isPalindrome(String input) {
        String filtered = input.toLowerCase().replaceAll("\\W+", "");
        int i = 0;
        int j = filtered.length() - 1;
        while (i < j) {
            if (filtered.charAt(i) != filtered.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}