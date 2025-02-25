package net.javaguides.finterfaces.consumer;

import java.util.function.Consumer;

public class PrintConsumerExample {

    public static void main(String[] args) {

        // Define Consumer that prints the string
        Consumer<String> printConsumer = str -> System.out.println(str);

        printConsumer.accept("Hello world!");

        // Define Consumer that convert the input to uppercase
        Consumer<String> uppperCaseConsumer = (str) -> System.out.println("Uppercase :" + str.toUpperCase());

        Consumer<String> result = printConsumer.andThen(uppperCaseConsumer);

        result.accept("Hello");
    }
}
