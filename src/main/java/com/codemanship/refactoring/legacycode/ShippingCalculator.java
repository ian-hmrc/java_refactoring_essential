package com.codemanship.refactoring.legacycode;

public class ShippingCalculator {

    private final OrderService orderService;

    public ShippingCalculator(OrderService orderService) {
        this.orderService = orderService;
    }

    /*
    ================================
    Order ID: 1001
    Shipping cost: 2.5
    
    ================================
    Running order 1002
    ================================
    Order ID: 1002
    Shipping cost: 36.8
    
    ================================
    Running order 1003
    ================================
    Order ID: 1003
    Shipping cost: 27.4
     */

    public double calculateShipping(int orderId) {

        try {
            Order order = orderService.getOrder(orderId);

            switch (order.getShippingType()) {

                case "STANDARD":
                    return order.getWeightKg() * 0.5;

                case "EXPRESS":
                    return order.getWeightKg() * 0.8
                            + order.getDistanceKm() * 0.1;

                case "OVERNIGHT":
                    return order.getWeightKg() * 1.2 + 25;

                default:
                    throw new RuntimeException(
                            "Unknown shipping type: "
                                    + order.getShippingType()
                    );
            }

        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

}
