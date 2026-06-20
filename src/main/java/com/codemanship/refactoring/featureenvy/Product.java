package com.codemanship.refactoring.featureenvy;

class Product {
    private final double price;
    private final boolean onSale;

    public Product(double price, boolean onSale) {
        this.price = price;
        this.onSale = onSale;
    }

    double price() {
        double price = this.price;

        if (onSale) {
            price = price * 0.8;
        }

        return price;
    }
}
