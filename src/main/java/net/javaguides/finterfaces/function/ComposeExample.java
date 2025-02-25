package net.javaguides.finterfaces.function;

import java.util.function.Function;

public class ComposeExample {

    public static void main(String[] args) {
        // Define a Function that trims a string
        Function<String, String> trim = str -> str.trim();
        System.out.println(trim.apply("  hello  "));

        // Define a Function that converts a string into uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("Hello"));

        // Compose the two functions
        Function<String, String> trimThenUpperCase = toUpperCase.compose(trim);
        String result = trimThenUpperCase.apply("  hello  ");
        System.out.println(result);
    }
}
