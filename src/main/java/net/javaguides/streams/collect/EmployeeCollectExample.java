package net.javaguides.streams.collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EmployeeCollectExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ramesh", 30),
                new Employee("Bob", 25),
                new Employee("Sanjay", 35)
        );

        Stream<Employee> stream = employees.stream();
        List<String> result = stream.map(Employee::getName) // Stream<String>
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
