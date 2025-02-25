package net.javaguides.lambda;

interface Shape {
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle is drawing ...");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square is drawing ..");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle is drawing ..");
    }
}

public class LambdaExample {
    public static void main(String[] args) {
//        Shape rectangle = new Rectangle();
//        rectangle.draw();
//
//        Shape square = new Square();
//        square.draw();
//
//        Shape circle = new Circle();
//        circle.draw();
//
        // Using Lambda expressions
        //Shape rectangle = () -> System.out.println("Rectangle is drawing");
        drawing(() -> System.out.println("Rectangle is drawing"));
        //rectangle.draw();

       // Shape square = () -> System.out.println("Square is drawing ..");
        drawing(() -> System.out.println("Square is drawing .."));
       // square.draw();

        //Shape circle = () -> System.out.println("Circle is drawing ..");
        drawing(() -> System.out.println("Circle is drawing .."));
       // circle.draw();
    }

    private static void drawing(Shape shape){
        shape.draw();
    }
}
