package com.example.emailvalidator;

import java.util.regex.Pattern;

/**
 * Validates an email address against a simplified regex pattern.
 * Assumes the input is a string.
 */
public class EmailValidator {

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
    }
}
