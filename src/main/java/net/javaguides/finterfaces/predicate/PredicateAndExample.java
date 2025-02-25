package net.javaguides.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateAndExample {

    public static void main(String[] args) {

        // Define predicates for checking if a string is not empty and has more than 5 characters
        Predicate<String> isNotEmpty = (str) -> !str.isEmpty();

        Predicate<String> hasMoreThanFiveChars = (str) -> str.length() > 5;

        // Combine predicates using and()
        Predicate<String> isValid = isNotEmpty.and(hasMoreThanFiveChars);
        boolean result = isValid.test("Hello World!");
        System.out.println(result);
    }
}
