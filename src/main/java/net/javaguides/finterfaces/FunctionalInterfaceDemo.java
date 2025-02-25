package net.javaguides.finterfaces;

@FunctionalInterface
interface Printable {
    void print(String message);

    default void m1(){
        System.out.println("default method m1");
    }

    static void m2(){
        System.out.println("static method m2");
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Printable printable = message -> System.out.println(message);
        printable.print("Hello functional interface");

    }
}
