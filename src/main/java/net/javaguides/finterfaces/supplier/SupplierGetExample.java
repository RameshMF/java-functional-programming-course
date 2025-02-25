package net.javaguides.finterfaces.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierGetExample {

    public static void main(String[] args) {

        // Define a Supplier that returns a constant value
        Supplier<String> constantSupplier = () -> "Hello World!";

        String result = constantSupplier.get();

        System.out.println(result);

        // Supplier that returns the current date and time
        Supplier<LocalDateTime> dateTimeSupplier = () -> LocalDateTime.now();

        LocalDateTime currentDateTime = dateTimeSupplier.get();

        System.out.println(currentDateTime);
    }
}
