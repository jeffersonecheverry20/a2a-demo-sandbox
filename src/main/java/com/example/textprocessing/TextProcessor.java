package com.example.textprocessing;

import java.util.regex.Pattern;

public class TextProcessor {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        return Pattern.compile("\\w+").matcher(input).results().sum(matchResult -> 1);
    }
}
