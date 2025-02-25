package net.javaguides.streams.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingElementsExample {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Apple", "Banana", "Mango", "Orange");

        long count = stream.collect(Collectors.counting());

        System.out.println(count);
    }
}
