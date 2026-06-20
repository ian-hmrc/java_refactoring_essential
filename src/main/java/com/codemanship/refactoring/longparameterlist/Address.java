package com.codemanship.refactoring.longparameterlist;

public record Address(
        String addressLine1,
        String addressLine2,
        String city,
        String postcode,
        String country
) {
}