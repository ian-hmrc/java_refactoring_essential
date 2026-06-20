package com.codemanship.refactoring.longparameterlist;

public class ShippingNoteGenerator {

    public String generateShippingNote(
            Customer customer,
            Address address1,
            Order order) {

        String fullName = customer.customerFirstName() + " " + customer.customerLastName();

        String address = address1.addressLine1() + ", "
                + (address1.addressLine2() != null ? address1.addressLine2() + ", " : "")
                + address1.city() + ", "
                + address1.postcode() + ", "
                + address1.country();

        return "SHIPPING NOTE\n"
                + "Order: " + order.orderId() + "\n"
                + "Customer: " + fullName + "\n"
                + "Ship To: " + address + "\n"
                + "Item: " + order.itemDescription() + "\n"
                + "Quantity: " + order.quantity();
    }
}
