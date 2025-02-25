package net.javaguides.streams.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 3, 6, 4, 8, 7, 9);

        System.out.println(numbers.stream()
                .min((Integer::compareTo)).get());
    }
}
