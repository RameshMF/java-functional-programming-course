package net.javaguides.finterfaces.supplier;

import java.util.function.*;

public class SupplierPrimitiveInterfacesExample {

    public static void main(String[] args) {

//        Supplier<Integer> randomValue = () -> (int) (Math.random() * 100);
//
//        System.out.println(randomValue.get());

        IntSupplier randomValue = () -> (int) (Math.random() * 100);

        System.out.println(randomValue.getAsInt());

        // LongSupplier to get the current system timestamp in milliseconds
        LongSupplier timestampSupplier = () -> System.currentTimeMillis();

        System.out.println(timestampSupplier.getAsLong());

        // DoubleSupplier to simulate the temperature sensor reading
        DoubleSupplier tempSupplier = () -> 15.5 + (Math.random() * 10);

        System.out.println("Temp : " + tempSupplier.getAsDouble());
    }
}
