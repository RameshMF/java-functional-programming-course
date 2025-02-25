package net.javaguides.streams.sorted;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class StreamProductSortingExample {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 50000.00),
                new Product(2, "Smartphone", 50000.00),
                new Product(3, "Tablet", 20000.00)
        ); // source

        // Sorting products by prices in asc order
        List<Product> productList = products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        productList.forEach((p) -> System.out.println(p.toString()));

        // Sorting products by prices in desc order
        List<Product> productListDesc = products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .toList();

        productListDesc.forEach((p) -> System.out.println(p.toString()));

        // Sorting products by price and name in asc order
        List<Product> productListMultipleFields = products.stream()
                .sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getName))
                .toList();

        productListMultipleFields.forEach((p) -> System.out.println(p.toString()));

        // Sorting products by price and name in desc order
        List<Product> productListMultipleFieldsDesc = products.stream()
                .sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getName).reversed())
                .toList();

        productListMultipleFieldsDesc.forEach((p) -> System.out.println(p.toString()));

    }
}
