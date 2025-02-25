package net.javaguides.streams.limit;

import java.util.Arrays;
import java.util.List;

public class StreamLimitExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange", "Cherry"); // source

        List<String> result = fruits.stream()
                .limit(3) // Limit the first 3 numbers from stream
                .toList();

        System.out.println(result);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> integerList = numbers.stream()
                .filter((number) -> number % 2 == 0) // stream
                .limit(5) // stream
                .toList();

        System.out.println(integerList);
    }
}
