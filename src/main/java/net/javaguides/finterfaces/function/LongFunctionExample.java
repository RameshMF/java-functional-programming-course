package net.javaguides.finterfaces.function;

import java.util.function.LongFunction;

public class LongFunctionExample {

    public static void main(String[] args) {

        // LongFunction to calculate the area of circle given a radius
        LongFunction<Double> areaOfCircle = radius -> Math.PI * radius * radius;

        System.out.println("Area of circle: " + areaOfCircle.apply(10L));
    }
}
