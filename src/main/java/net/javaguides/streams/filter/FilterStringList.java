package net.javaguides.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringList {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange", "Cherry"); // source

        // Traditional way (before java 8)
        List<String> filteredFruits = new ArrayList<>();

        for(String fruit: fruits){
            if(fruit.equals("Banana")){
                filteredFruits.add(fruit);
            }
        }

        System.out.println(filteredFruits);

        // Using Java 8 Stream API to filter strings from a List
        System.out.println(fruits.stream().filter(fruit -> fruit.equals("Banana"))
                .toList());
    }
}
