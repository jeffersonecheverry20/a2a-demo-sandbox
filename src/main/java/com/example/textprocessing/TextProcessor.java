package com.example.textprocessing;

public class TextProcessor {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        int wordCount = 0;
        boolean inWord = false;
        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                wordCount++;
            }
        }
        return wordCount;
    }
}
