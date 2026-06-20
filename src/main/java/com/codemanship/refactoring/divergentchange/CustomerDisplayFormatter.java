package com.codemanship.refactoring.divergentchange;

public class CustomerDisplayFormatter {
    static String formatName(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim().toUpperCase();
    }
}
