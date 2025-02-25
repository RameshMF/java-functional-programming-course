package net.javaguides.finterfaces.function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        // Traditional way
        Function<String, String> function = new Function<String, String>() {
            @Override          public String apply(String s) {
                return s.toUpperCase();
            }
        };

        String result = function.apply("Ramesh");
        System.out.println(result);


        // Using Lambda expression
        Function<String, String> function1 = message -> message.toUpperCase();
        System.out.println(function1.apply("Ramesh"));

        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reverseString.apply("Fadatare"));
    }
}
