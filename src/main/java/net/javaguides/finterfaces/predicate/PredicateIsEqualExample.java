package net.javaguides.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

    public static void main(String[] args) {

        // Predicate to check if the input equals "Java"
        Predicate<String> isJava = Predicate.isEqual("Java");

        boolean result = isJava.test("Java");

        System.out.println(result);
    }
}
