package net.javaguides.streams.skip;

import java.util.Arrays;
import java.util.List;

public class StreamSkipExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .skip(5) // ignore the first 5 numbers from a stream -> Stream -> 6,7,8,9,10
                .limit(3) // limit the first 3 numbers from stream -> 6,7,8
                .toList();

        System.out.println(result);

    }
}
