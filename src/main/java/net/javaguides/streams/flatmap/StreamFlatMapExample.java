package net.javaguides.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Converting Nested Lists into a Single List
public class StreamFlatMapExample {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        ); // source

        Stream<List<Integer>> stream = listOfLists.stream();
        // mapping as well as flattening
        List<Integer> result = stream.flatMap((list) -> list.stream()) // Stream<Stream> -> Stream
                .toList();

        System.out.println(result);

        // Collecting Nested Arrays into a Single List
        String[][] dataArray = new String[][]{{"a", "b"},
                {"c", "d"}, {"e", "f"}, {"g", "h"}}; // source

        Stream<String[]> streamArray = Arrays.stream(dataArray);
        List<String> result1 = streamArray.flatMap((strArray) -> Arrays.stream(strArray)) // Stream<Stream>
                .toList();

        System.out.println(result1);
    }
}
