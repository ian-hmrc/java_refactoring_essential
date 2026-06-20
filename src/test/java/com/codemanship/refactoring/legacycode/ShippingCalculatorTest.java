package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShippingCalculatorTest {

    @Test
    void calculateShippingForOrder1001() {
        OrderService mockOrderService = orderId -> new Order(1001, "STANDARD", 5.0, 120.0, false);
        ShippingCalculator shippingCalculator = new ShippingCalculator(mockOrderService);

        double shippingCost = shippingCalculator.calculateShipping(1001);

        assertEquals(2.5, shippingCost);
    }

    @Test
    void calculateShippingForOrder1002() {
        OrderService mockOrderService = orderId -> new Order(1002, "EXPRESS", 8.5, 300.0, false);
        ShippingCalculator shippingCalculator = new ShippingCalculator(mockOrderService);

        double shippingCost = shippingCalculator.calculateShipping(1002);

        assertEquals(36.8, shippingCost);
    }

    @Test
    void calculateShippingForOrder1003() {
        OrderService mockOrderService = orderId -> new Order(1003, "OVERNIGHT", 2.0, 50.0, false);
        ShippingCalculator shippingCalculator = new ShippingCalculator(mockOrderService);

        double shippingCost = shippingCalculator.calculateShipping(1003);

        assertEquals(27.4, shippingCost);
    }

    @Test
    void calculateShippingForOrder1004() {
        OrderService mockOrderService = orderId -> new Order(1004, "INTERNATIONAL", 2.0, 50.0, false);
        ShippingCalculator shippingCalculator = new ShippingCalculator(mockOrderService);

        double shippingCost = shippingCalculator.calculateShipping(1004);

        assertEquals(3.0, shippingCost);
    }
}