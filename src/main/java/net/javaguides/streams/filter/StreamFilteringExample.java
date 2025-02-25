package net.javaguides.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilteringExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Source


        // Traditional way of filtering even numbers from list
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number: numbers) {
            if(number % 2 == 0){
                evenNumbers.add(number);
            }
        }

        System.out.println(evenNumbers);

        // Using Stream API to filter even numbers
        System.out.println(numbers.stream().filter(number -> number % 2 == 0)
                .toList());
    }
}
