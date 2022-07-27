package ru.otus.java.oop.slides;

import java.util.Date;

public class OopShop {
    public static void main(String[] args) {
        Product product = new Product("Философия Java");

        Order order = new Order();
        order.addOrderLine(product, 1);
    }
}

class Order {
    private Date date;
    private String number;
    private OrderLine[] lines;

    public void addOrderLine(Product product, int quantity) {

    }

    public void process() {

    }
}

class OrderLine {
    private int quantity;
    private long price;
    private Product product;
}

class Product {
    private String name;
    private String description;
    private long price;

    public Product(String name) {
        this.name = name;
    }
}