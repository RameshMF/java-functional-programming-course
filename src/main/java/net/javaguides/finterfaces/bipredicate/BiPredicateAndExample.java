package net.javaguides.finterfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateAndExample {

    public static void main(String[] args) {

        // BiPredicate to check if both the numbers are positive
        BiPredicate<Integer, Integer> positiveNumbers = (num1, num2) -> num1 > 0 && num2 > 0;

        // BiPredicate to check if both numbers are even
        BiPredicate<Integer, Integer> evenNumbers = (num1, num2) -> num1 % 2 == 0 && num2 % 2 == 0;

        // using and()
        BiPredicate<Integer, Integer> positiveAndEven = positiveNumbers.and(evenNumbers);

        System.out.println(positiveAndEven.test(4, 6)); // true
        System.out.println(positiveAndEven.test(-4, 6)); // false
        System.out.println(positiveAndEven.test(5, 6)); // false

        // using or()
        BiPredicate<Integer, Integer> positiveOrEven = positiveNumbers.or(evenNumbers);
        System.out.println(positiveOrEven.test(-1, 2));
        System.out.println(positiveOrEven.test(2, 5)); // true
        System.out.println(positiveOrEven.test(2, 4)); // true

        // using negate()
        // BiPredicate to check if both the strings are equal
        BiPredicate<String, String> isEqual = (str1, str2) -> str1.equals(str2);

        // BiPredicate to check if both strings are not equal
        BiPredicate<String, String> isNotEqual = isEqual.negate();

        System.out.println(isNotEqual.test("hello", "hi"));
    }

}
