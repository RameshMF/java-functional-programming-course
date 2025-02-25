package net.javaguides.finterfaces.bifunction;

import java.util.function.BiFunction;

public class RectangleAreaBiFunctionExample {

    public static void main(String[] args) {


        // Define a BiFunction to calculate the area of rectangle
        BiFunction<Integer, Integer, Integer> calculateArea = (length, width) -> length * width;

        int area = calculateArea.apply(5, 4);

        System.out.println("Area of rectangle: " + area);
    }
}
