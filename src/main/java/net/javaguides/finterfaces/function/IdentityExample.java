package net.javaguides.finterfaces.function;

import java.util.function.Function;

public class IdentityExample {

    public static void main(String[] args) {

        Function<String, String> function = Function.identity();
        String result = function.apply("hello");
        System.out.println(result);
    }
}
