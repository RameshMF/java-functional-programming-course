package net.javaguides.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamExample {

    public static void main(String[] args) {

        // Create a Stream from List
//        List<String> fruitList = new ArrayList<>();
//        fruitList.add("Banana");
//        fruitList.add("Mango");
//        fruitList.add("Apple");
//        fruitList.add("Orange");

        List<String> fruitList = Arrays.asList("Banana", "Mango", "Apple", "Orange"); // Source
        Stream<String> stream = fruitList.stream(); // Create stream from List (source)
        stream.forEach(System.out::println);

        // Create a Stream from Set
        Set<String> fruitSet = new HashSet<>(fruitList);
        Stream<String> stream1 = fruitSet.stream();
        stream1.forEach(System.out::println);

        // Create a Stream from Map
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 10);
        fruitMap.put("Mango", 15);
        fruitMap.put("Orange", 20);
        fruitMap.put("Banana", 5);

        // Create a Stream from Map's entrySet
        Stream<Map.Entry<String, Integer>> mapEntryStream = fruitMap.entrySet().stream();
        mapEntryStream.forEach(System.out::println);

        // Create a Stream from Map's keySet
        Stream<String> mapKeySetStream = fruitMap.keySet().stream();
        mapKeySetStream.forEach(System.out::println);

        // Create a Stream from Map's values
        Stream<Integer> mapValuesStream = fruitMap.values().stream();
        mapValuesStream.forEach(System.out::println);

        // Create a Stream from an Array
        String[] strArray = {"Banana", "Mango", "Apple"}; // Source
        Stream<String> arrayStream = Arrays.stream(strArray); // Create Stream from Array
        arrayStream.forEach(System.out::println);

        // Create a Stream using Stream.of() method
        Stream<String> ofStream = Stream.of("Apple", "Banana", "Mango");
        ofStream.forEach(System.out::println);

    }
}
