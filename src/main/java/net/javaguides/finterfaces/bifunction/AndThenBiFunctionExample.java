package net.javaguides.finterfaces.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AndThenBiFunctionExample {

    public static void main(String[] args) {

        // Define BiFunction to calculate the product of two numbers
        BiFunction<Integer, Integer, Integer> multiplyNumbers = (num1, num2) -> num1 * num2;

        // Define Function to convert the result to a string
        Function<Integer, String> convertToString = num -> "Product: " + num;

        // Chain the BinFunction and Function using andThen()
        BiFunction<Integer, Integer, String> multipleAndConvert = multiplyNumbers.andThen(convertToString);

        String result = multipleAndConvert.apply(5, 4);

        System.out.println(result);
    }
}
