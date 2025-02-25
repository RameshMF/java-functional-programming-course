package net.javaguides.finterfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateTestExample {

    public static void main(String[] args) {
        // BiPredicate to check if two strings have the same length
        BiPredicate<String, String> sameLength =  (str1, str2) -> str1.length() == str2.length();

        System.out.println(sameLength.test("hello", "hello"));

        System.out.println(sameLength.test("hello", "hi"));
    }
}
