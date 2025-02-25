package net.javaguides.finterfaces.consumer;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerPrimitiveInterfacesExample {

    public static void main(String[] args) {

        IntConsumer printValue = value -> System.out.println("Value: " + value);

        printValue.accept(5);

        // LongConsumer to log the timestamp values
        LongConsumer longTimestamp = timestamp -> System.out.println("Timestamp: " + timestamp);

        System.out.println(System.currentTimeMillis());

        // DoubleConsumer to log the expenses
        DoubleConsumer logExpense = expense -> System.out.println("Expense recorded: $ " + expense);

        logExpense.accept(99.99);

    }
}
