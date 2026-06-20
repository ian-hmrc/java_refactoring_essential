package com.codemanship.refactoring.divergentchange;

public class CustomerService {

    public boolean isValidEmail(String email) {
        return EmailValidator.validateEmail(email);
    }

    public String formatDisplayName(String firstName, String lastName) {
        return CustomerDisplayFormatter.formatName(firstName, lastName);
    }

    public int calculateLoyaltyPoints(int numberOfPurchases) {
        return LoyaltyService.loyaltyPoint(numberOfPurchases);
    }

    public String determineAccountStatus(int daysSinceLastLogin) {
        return AccountStatusService.accountStatus(daysSinceLastLogin);
    }

}
