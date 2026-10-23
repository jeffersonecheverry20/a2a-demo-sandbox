package com.example.emailvalidator;

import java.util.regex.Pattern;

/**
 * Validates an email address against a more robust regex pattern.
 * Assumes the input is a string.
 */
public class EmailValidator {

    private static final String REGEX = "^(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|"."(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*))*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";

    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return Pattern.compile(REGEX).matcher(email).matches();
    }
}
