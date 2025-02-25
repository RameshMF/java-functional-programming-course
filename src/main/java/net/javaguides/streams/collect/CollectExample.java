package net.javaguides.streams.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("apple", "banana", "mango");
        List<String> result = stream1.collect(Collectors.toList());
        System.out.println(result);

        Stream<String> stream2 = Stream.of("apple", "banana", "mango", "apple");
        Set<String> result2 = stream2.collect(Collectors.toSet());
        System.out.println(result2);

        Stream<String> stream3 = Stream.of("apple", "banana", "mango");
        Map<String, Integer> map = stream3.collect(Collectors.toMap(
                fruit -> fruit,
                fruit -> fruit.length()
        ));

        System.out.println(map);
    }
}
