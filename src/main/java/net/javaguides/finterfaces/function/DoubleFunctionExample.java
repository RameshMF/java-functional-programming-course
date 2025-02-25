package net.javaguides.finterfaces.function;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {

    public static void main(String[] args) {

        // DoubleFunction to calculate the discounted price (20% discount)
        DoubleFunction<Double> calculateDiscount = price -> price * 0.80;

        System.out.println(calculateDiscount.apply(250.75));
    }
}
