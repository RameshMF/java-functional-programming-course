package net.javaguides.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class SortEmployeeListExample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ramesh", 30, 50000));
        employees.add(new Employee(2, "Sanjay", 31, 45000));
        employees.add(new Employee(3, "Pramod", 30, 25000));
        employees.add(new Employee(4, "Raj", 34, 75000));

//        Collections.sort(employees, new SortEmployee()); // sort employees by salary in ascending order
//
//        System.out.println(employees);
//
//        Collections.sort(employees, new SortEmployeeDesc()); // Sort employee by salary in descending order
//        System.out.println(employees);

        // Using Lambda expression

        Collections.sort(employees, (o1, o2) -> o1.getSalary() - o2.getSalary()); // Sort the employee by salary in ascending order
        System.out.println(employees);

        Collections.sort(employees, (o1, o2) -> o2.getSalary() - o1.getSalary()); // Sort the employee by salary in descending order
        System.out.println(employees);
    }
}

class SortEmployee implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}

class SortEmployeeDesc implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSalary() - o1.getSalary();
    }
}
