package net.javaguides.lambda;

interface Calculator {
    int calculate(int a, int b);
}

class Addition implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Subtraction implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

class Multiplication implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}

class Division implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}

public class CalculatorLambdaExample {

    public static void main(String[] args) {
//        Calculator addition = new Addition();
//        int result = addition.calculate(10, 20);
//        System.out.println(result);
//
//        Calculator subtraction = new Subtraction();
//        System.out.println(subtraction.calculate(20, 10));
//
//        Calculator multiplication = new Multiplication();
//        System.out.println(multiplication.calculate(10, 20));
//
//        Calculator division = new Division();
//        System.out.println(division.calculate(20, 10));

        // Using Lambda expression

        //Calculator addition = (a, b) -> a + b;
       // System.out.println(addition.calculate(10, 20));

        System.out.println(calculate(10, 20, (a, b) -> a + b));

        //Calculator subtraction = (a, b) -> a - b;
        //System.out.println(subtraction.calculate(20, 10));

        System.out.println(calculate(20, 10, (a, b) -> a - b));

//        Calculator multiplication = (a, b) -> a * b;
//        System.out.println(multiplication.calculate(10, 20));

        System.out.println(calculate(10, 20, (a, b) -> a * b));

//        Calculator division = (a, b) -> a / b;
//        System.out.println(division.calculate(20, 10));

        System.out.println(calculate(20, 10, (a, b) -> a / b));
    }

    private static int calculate(int a, int b, Calculator calculator){
        return calculator.calculate(a, b);
    }
}
