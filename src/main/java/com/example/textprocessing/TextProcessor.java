package com.example.textprocessing;

public class TextProcessor {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        return input.split(" +").length;
    }
}