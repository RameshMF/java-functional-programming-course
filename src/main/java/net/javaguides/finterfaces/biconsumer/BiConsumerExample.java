package net.javaguides.finterfaces.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        // Define a BiConsumer that prints two strings (firstname and lastname)
        BiConsumer<String, String> printFullName = (firstName, lastName) -> System.out.println("Full name: " + firstName + " " + lastName);

        printFullName.accept("Ramesh", "Fadatare");

        // Define a BiConsumer that prints email and password
        BiConsumer<String, String> printEmailPassword = (email, password) -> {
            System.out.println("Email: " + email);
            System.out.println("Password: "+ password);
        };

        printEmailPassword.accept("ramesh@gmail.com", "ramesh_secret");

    }
}
