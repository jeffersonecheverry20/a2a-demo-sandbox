package com.example.textprocessing;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TextAnalyzer {

    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        return Arrays.stream(text.trim().split("\\s+"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList())
                .size();
    }
}