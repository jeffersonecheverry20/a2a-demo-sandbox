package com.example.emailvalidator;

public class EmailValidator {

    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        final String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(regex);
    }
}
