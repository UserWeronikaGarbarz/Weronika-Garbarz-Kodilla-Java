package com.kodilla.good.patterns.Food2Door.producer;

public class Product {

    private final String name;
    private final String typeOfProduct;
    private final int quantity;

    public Product(String name, String typeOfProduct, int quantity) {
        this.name = name;
        this.typeOfProduct = typeOfProduct;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", typeOfProduct='" + typeOfProduct + '\'' +
                '}';
    }
}
