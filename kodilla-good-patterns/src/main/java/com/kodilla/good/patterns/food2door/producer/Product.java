package com.kodilla.good.patterns.food2door.producer;

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
        return "Product {" +
                "name='" + name + '\'' +
                ", typeOfProduct='" + typeOfProduct + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
