package com.example.textprocessing;

public class TextAnalyzer {

    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && inWord) {
                inWord = false;
            } else if (text.charAt(i) != ' ') {
                inWord = true;
                if (i > 0 && text.charAt(i - 1) == ' ') {
                    continue;
                }
                wordCount++;
            }
        }
        return wordCount;
    }
}