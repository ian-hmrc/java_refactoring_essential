package com.codemanship.refactoring.longparameterlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippingNoteServiceTest {

    private final ShippingNoteGenerator shippingNoteGenerator = new ShippingNoteGenerator();

    @Test
    void shouldGenerateShippingNoteWithAllInputFields() {

        String result = shippingNoteGenerator.generateShippingNote(

                new Customer("Jane", "Doe"), new Address("12 Baker Street", "Flat 4B", "London", "NW1 6XE", "UK"),
                new Order("ORD-123", "Wireless Headphones", 2));

        assertTrue(result.contains("Order: ORD-123"));
        assertTrue(result.contains("Customer: Jane Doe"));
        assertTrue(result.contains("Item: Wireless Headphones"));
        assertTrue(result.contains("Quantity: 2"));

        assertTrue(result.contains("12 Baker Street"));
        assertTrue(result.contains("Flat 4B"));
        assertTrue(result.contains("London"));
        assertTrue(result.contains("NW1 6XE"));
        assertTrue(result.contains("UK"));
    }

    @Test
    void shouldIncludeCustomerFullName() {

        String result = shippingNoteGenerator.generateShippingNote(

                new Customer("John", "Smith"), new Address("1 High Street", "Apt 2", "Manchester", "M1 2AB", "UK"),
                new Order("ORD-999", "Laptop", 1));

        assertTrue(result.contains("Customer: John Smith"));
    }

    @Test
    void shouldIncludeOrderIdAndItemDetails() {

        String result = shippingNoteGenerator.generateShippingNote(

                new Customer("Alice", "Brown"), new Address("50 King Street", "Unit 3", "Birmingham", "B1 1AA", "UK"),
                new Order("ORD-555", "Tablet", 5));

        assertTrue(result.contains("Order: ORD-555"));
        assertTrue(result.contains("Item: Tablet"));
        assertTrue(result.contains("Quantity: 5"));
    }

    @Test
    void shouldIncludeFullAddressAcrossAllFields() {

        String result = shippingNoteGenerator.generateShippingNote(

                new Customer("Emma", "Jones"), new Address("99 High Road", "Floor 2", "Leeds", "LS1 4AB", "UK"),
                new Order("ORD-777", "Monitor", 3));

        assertTrue(result.contains("99 High Road"));
        assertTrue(result.contains("Floor 2"));
        assertTrue(result.contains("Leeds"));
        assertTrue(result.contains("LS1 4AB"));
        assertTrue(result.contains("UK"));
    }

    @Test
    void shouldIncludeQuantityCorrectly() {

        String result = shippingNoteGenerator.generateShippingNote(

                new Customer("Tom", "White"), new Address("10 Market Street", "", "Liverpool", "L1 8JQ", "UK"),
                new Order("ORD-321", "Keyboard", 10));

        assertTrue(result.contains("Quantity: 10"));
    }
}
