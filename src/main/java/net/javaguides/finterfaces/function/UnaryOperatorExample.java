package net.javaguides.finterfaces.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        // Define a Function that squares a number
//        Function<Integer, Integer> square = (number) -> number * number;
//
//        int result = square.apply(2);
//
//        System.out.println(result);

        UnaryOperator<Integer> square = (number) -> number * number;

        int result = square.apply(2);

        System.out.println(result);


        // Define UnaryOperator to trim the string
        UnaryOperator<String> trim = (str) -> str.trim();

        // Define UnaryOperator to convert a string to uppercase
        UnaryOperator<String> toUpperCase = (str) -> str.toUpperCase();

        UnaryOperator<String> trimAndUppercase = trim.andThen(toUpperCase)::apply;

        System.out.println(trimAndUppercase.apply("  hello  "));

       // System.out.println(toUpperCase.apply("Hello"));
    }
}
