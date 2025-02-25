package net.javaguides.streams.allmatch;

import java.util.Arrays;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class StreamAllMatchExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ramesh", 55000),
                new Employee(2, "Umesh", 45000),
                new Employee(3, "Sanjay", 50000),
                new Employee(4, "John", 30000)
        );

        boolean result = employees.stream()
                .allMatch(employee -> employee.getSalary() > 25000);

        System.out.println(result);

    }
}
