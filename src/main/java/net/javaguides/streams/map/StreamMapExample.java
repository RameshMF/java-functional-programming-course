package net.javaguides.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango"); // source

        Stream<String> stream = fruits.stream(); // stream

        List<String> list = stream
                .peek((element) -> System.out.println("Before map() method: " + element))
                .map((element) -> element.toUpperCase())
                .peek((element) -> System.out.println("After map() method: " + element))
                .toList();

        System.out.println(list);
    }
}
