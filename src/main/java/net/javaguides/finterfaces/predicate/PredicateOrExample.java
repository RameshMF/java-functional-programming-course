package net.javaguides.finterfaces.predicate;

import java.util.function.Predicate;

public class PredicateOrExample {

    public static void main(String[] args) {

        // Predicate to check if a number is less than 5
        Predicate<Integer> isLessThanFive = num -> num < 5;

        // Predicate to check if a number is greater than 15
        Predicate<Integer> isGreaterThanFifteen = num -> num > 15;

        // Combine predicates using or()
        Predicate<Integer> result = isLessThanFive.or(isGreaterThanFifteen);
        System.out.println(result.test(3));
    }
}
