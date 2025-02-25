package net.javaguides.streams.max;

import java.util.Arrays;
import java.util.List;

public class StreamMaxExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 5, 4, 3, 2, 9, 7, 8, 6);

        int max = numbers.stream()
                .max(Integer::compareTo) // Optional
                .get();

        System.out.println(max);

    }
}
