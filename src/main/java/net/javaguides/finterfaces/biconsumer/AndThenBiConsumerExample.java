package net.javaguides.finterfaces.biconsumer;

import java.util.function.BiConsumer;

public class AndThenBiConsumerExample {
    public static void main(String[] args) {

        // Define a BiConsumer to print two numbers
        BiConsumer<Integer, Integer> printNumbers = (num1, num2) -> System.out.println("Numbers: " + num1 + ", " + num2);

        // Define a BiConsumer to add two numbers and print the sum
        BiConsumer<Integer, Integer> addNumbers = (num1, num2) -> System.out.println("Sum: " + (num1 + num2));

        BiConsumer<Integer, Integer> printAndAdd = printNumbers.andThen(addNumbers);

        printAndAdd.accept(7, 8);
    }
}
