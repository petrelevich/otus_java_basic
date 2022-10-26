package ru.otus.java.oop.slides;

import java.util.Date;

public class OopShop {
    public static void main(String[] args) {
        Order order1 = new Order("28 марта 2021", "123-456777");
        Product product1 = new Product("Java concurrency");
        order1.addOrderLine(product1, 2646, 2);
        order1.addOrderLine(new Product("Философия Java"), 2151, 1);
        order1.addOrderLine(new Product("Изучаем Java"), 1365, 1);

        Order order2 = new Order("21 марта 2021", "123-456788");
        order2.addOrderLine(
                new Product("Паттерны проектирования"), 1000, 1);

        Order[] orders = {order1, order2};
    }
}

class Order {
    private Date date;
    private String number;
    private OrderLine[] lines;

    public Order(String date, String number) {

    }

    public void addOrderLine(Product product, int unitPrice, int quantity) {

    }

    public void process() {

    }
}

class OrderLine {
    private int quantity;
    private long unitPrice;
    private Product product;
    private final Order order;

    OrderLine(Order order) {
        if (order == null)
            throw new IllegalArgumentException("order");

        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    // Важно! Нет методов для изменения order
}

class Product {
    private String name;
    private String description;
    private long price;

    public Product(String name) {
        this.name = name;
    }
}