package net.javaguides.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbersExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 3, 6, 7, 9, 8, 5, 1); // source

        List<Integer> result = numbers.stream()
                .sorted() // natural order
                .toList();

        System.out.println(result);

        // Sort list of integers in desc order
        List<Integer> result1 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(result1);

    }
}
