package net.javaguides.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateTestExample {

    public static void main(String[] args) {

        // Predicate to check if a number is greater than 10
        Predicate<Integer> isGreaterThanTen = num -> num > 10;

        boolean result = isGreaterThanTen.test(15);
        System.out.println(result);
    }
}
