package net.javaguides.finterfaces.function;

import java.util.function.Function;

public class AndThenExample {

    public static void main(String[] args) {

        // Define a Function that coverts a string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        // Define another Function that calculates the length of a string
        Function<String, Integer> stringLength = str -> str.length();

        Function<String, Integer> upperCaseThenLength = toUpperCase.andThen(stringLength);
        int length = upperCaseThenLength.apply("Ramesh");
        System.out.println(length);
    }
}
