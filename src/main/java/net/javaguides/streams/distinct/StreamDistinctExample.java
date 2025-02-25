package net.javaguides.streams.distinct;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Apple", "Mango", "Orange", "Orange", "Cheery");

        List<String> list = fruits.stream()
                .distinct() // Remove duplicates - Stream - unique elements
                .toList();

        System.out.println(list);
    }
}
