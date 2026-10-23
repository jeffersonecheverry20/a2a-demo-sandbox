package com.example;

public class StringHelper {
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char cLeft = Character.toLowerCase(str.charAt(left));
            char cRight = Character.toLowerCase(str.charAt(right));
            if (!Character.isLetterOrDigit(cLeft)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(cRight)) {
                right--;
                continue;
            }
            if (cLeft != cRight) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
