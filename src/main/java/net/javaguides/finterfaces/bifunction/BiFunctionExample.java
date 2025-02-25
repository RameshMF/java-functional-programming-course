package net.javaguides.finterfaces.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

        // Define a BiFunction to add two numbers
        BiFunction<Integer, Integer, Integer> addition = (num1, num2) -> num1 + num2;

        int result = addition.apply(10, 20);

        System.out.println("Addition: " + result);

        // Define a BiFunction to subtract two numbers
        BiFunction<Integer, Integer, Integer> subtraction = (num1, num2) -> num1 - num2;

        int result1 = subtraction.apply(20, 10);

        System.out.println("Subtraction: " + result1);

        // Define a BiFunction to multiply two numbers
        BiFunction<Integer, Integer, Integer> multiplication = (num1, num2) -> num1 * num2;

        int result2 = multiplication.apply(20, 10);

        System.out.println("Multiplication: " + result2);

        // Define a BiFunction to divide two numbers
        BiFunction<Integer, Integer, Integer> division = (num1, num2) -> num1 / num2;

        int result3 = division.apply(20, 10);

        System.out.println("Division: " + result3);

    }
}
