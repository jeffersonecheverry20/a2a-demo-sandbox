package com.example.emailvalidator;

import java.util.regex.Pattern;

/**
 * Validates a basic email format.
 */
public class EmailValidator {

    private static final String EMAIL_PATTERN = "^(?!.*@\\.)(?!.*\\.$)(?!^\\.)(?!.*\\.\\.)(\\w+)(\\.(\\w+))*)@([A-Za-z0-9]+)(\\.[A-Za-z]{2,})+";

    /**
     * Checks if the provided string is a valid email address.
     * 
     * @param email the email address to validate
     * @return true if the email is valid, false otherwise
     */
    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty() || email.length() < 6) {
            return false;
        }
        return Pattern.matches(EMAIL_PATTERN, email);
    }
}