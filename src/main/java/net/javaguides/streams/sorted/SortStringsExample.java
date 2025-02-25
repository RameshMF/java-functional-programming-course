package net.javaguides.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Cherry", "Orange"); // source

        List<String> result = fruits.stream()
                .sorted() // natural order - alphabetical order
                .toList();

        System.out.println(result);

        List<String> result1 = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(result1);
    }
}
