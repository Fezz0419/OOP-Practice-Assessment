package com.assessment.products;

/**
 * Abstract base class for all products
 */
public abstract class Product {
    // TODO: Declare private fields for id, name, price, and stockQuantity
    private int id;
    private String name;
    private double price;
    private int quantity;
    /**
     * Constructs a Product object.
     * @param id The product ID.
     * @param name The product name.
     * @param price The unit price of the product.
     * @param stockQuantity The number of units in stock.
     */
    // TODO: Create a constructor that initializes all fields
    public Product(String id, String name, double price, int stockQuantity) {
        // TODO: IMPLEMENT: Initialize fields, calling setters for price and stockQuantity.
        this.id = Integer.parseInt(id);
        this.name = name;
        this.price = price;
        this.quantity = stockQuantity;
    }

    // TODO: Create getters for all fields
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return quantity; }

    // TODO: Create setters for price and stockQuantity with validation
    public void setPrice(double price) {
        // TODO: IMPLEMENT: Set price, throwing IllegalArgumentException if price < 0.
        this.price = price;

    }

    public void setStockQuantity(int stockQuantity) {
        // TODO: IMPLEMENT: Set stockQuantity, throwing IllegalArgumentException if quantity < 0.
        this.quantity = stockQuantity;
    }

    /**
     * Abstract method to calculate the product's discount based on its specific type rules.
     * @return The discount amount in dollars (not percentage).
     */
    public double calculateDiscount(){
        return price * quantity;
    }

    /**
     * Calculates the price after applying the discount.
     * @return The final price after discount.
     */
    public double getDiscountedPrice() {
        // TODO: IMPLEMENT: Return the price after subtracting the discount.
        return price * calculateDiscount();
    }

    @Override
    public String toString() {
        // TODO: IMPLEMENT: Return a formatted string with core product information.
        return String.format("ID: %d, Name: %s, Price: %.2f, Stock: %d", id, name, price, quantity);
    }
}