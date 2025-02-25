package net.javaguides.finterfaces.function;

import java.util.function.Function;
import java.util.function.IntFunction;

public class IntFunctionExample {

    public static void main(String[] args) {

//        // Define a Function to convert int to String
//        Function<Integer, String> intToString = num -> "Number: " + num;
//
//        System.out.println(intToString.apply(10));

        // Define a IntFunction to convert int to String
        IntFunction<String> intToString = num -> "Number: " + num;

        System.out.println(intToString.apply(10));
    }
}
