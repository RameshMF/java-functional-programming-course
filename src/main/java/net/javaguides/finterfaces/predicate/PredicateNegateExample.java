package net.javaguides.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateNegateExample {

    public static void main(String[] args) {

        // Predicate to check if a string is empty
        Predicate<String> isEmpty = str -> str.isEmpty();

        // Negate the predicate
        Predicate<String> isNotEmpty = isEmpty.negate();

        boolean result = isNotEmpty.test("Hello");
        System.out.println(result);
    }
}
