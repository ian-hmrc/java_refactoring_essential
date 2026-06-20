package com.codemanship.refactoring.longparameterlist;

public class ShippingNoteGenerator {

    public String generateShippingNote(
            Customer customer,
            Address address,
            Order order) {

        String fullName = customer.customerFirstName() + " " + customer.customerLastName();

        return "SHIPPING NOTE\n"
                + "Order: " + order.orderId() + "\n"
                + "Customer: " + fullName + "\n"
                + "Ship To: " + address.formatAddress() + "\n"
                + "Item: " + order.itemDescription() + "\n"
                + "Quantity: " + order.quantity();
    }

}
