package net.javaguides.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample2 {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5"); // list of strings

        List<Integer> list = listOfStrings.stream()
                .map((element) -> Integer.valueOf(element))
                .toList();

        System.out.println(list);


    }
}
