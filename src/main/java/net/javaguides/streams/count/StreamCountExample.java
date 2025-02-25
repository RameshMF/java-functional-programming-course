package net.javaguides.streams.count;

import java.util.Arrays;
import java.util.List;

public class StreamCountExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Orange", "Cherry");

        long count = fruits.stream() // create a stream from list
                .count(); // count the number of elements in a stream

        System.out.println(count);

    }
}
