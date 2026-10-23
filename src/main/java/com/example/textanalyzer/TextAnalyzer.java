package com.example.textanalyzer;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TextAnalyzer {
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return Arrays.stream(text.split("\\s+"))
                .filter(word -> !word.trim().isEmpty())
                .collect(Collectors.toList()).size();
    }
}