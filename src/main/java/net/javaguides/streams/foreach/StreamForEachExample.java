package net.javaguides.streams.foreach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamForEachExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango"); // source

        fruits.stream()
                .forEach((element) -> System.out.println(element));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // source
        numbers.stream()
                .forEach((element) -> System.out.println(element));

        numbers.stream()
                .sorted(Comparator.reverseOrder()) // stream
                .forEach((element) -> System.out.println(element));

    }
}
