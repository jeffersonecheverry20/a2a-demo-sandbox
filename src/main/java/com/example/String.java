package com.example;

public class StringHelper {
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