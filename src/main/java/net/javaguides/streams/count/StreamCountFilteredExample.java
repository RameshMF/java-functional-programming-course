package net.javaguides.streams.count;

import java.util.Arrays;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class StreamCountFilteredExample {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 75000),
                new Product("Smartphone", 25000),
                new Product("Tablet", 20000),
                new Product("Monitor", 40000),
                new Product("Smartwatch", 15000)
        );

        // Using count() to count the products prices above 30000
        long productCount = products.stream()
                .filter(product -> product.getPrice() > 20000) // stream
                .count(); // count the filtered elements

        System.out.println(productCount);

    }
}
