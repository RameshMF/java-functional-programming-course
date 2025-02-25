package net.javaguides.finterfaces.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        // Define BiFunction to add two numbers
//        BiFunction<Integer, Integer, Integer> addition = (num1, num2) -> num1 + num2;
//
//        int result = addition.apply(10, 20);
//
//        System.out.println(result);

        BinaryOperator<Integer> addition = (num1, num2) -> num1 + num2;

        int result = addition.apply(10, 20);

        System.out.println(result);

        BinaryOperator<String> fullName = (firstName, lastName) -> firstName + " " + lastName;
        System.out.println(fullName.apply("Ramesh", "Fadatare"));

        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(6,7,8,9, 10);

        BinaryOperator<List<Integer>> merged = (l1, l2) -> {
            List<Integer> list3 = new ArrayList<>(l1);
            list3.addAll(l2);
            return list3;
        };

        List<Integer> mergedResult = merged.apply(list1, list2);

        System.out.println(mergedResult);
    }
}
