package com.example.emailvalidator;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_PATTERN = \\w+@[\\w.-]+\\.[\\w.-]+;

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public boolean isValidEmail(String email) {
        return pattern.matcher(email).matches();
    }
}
