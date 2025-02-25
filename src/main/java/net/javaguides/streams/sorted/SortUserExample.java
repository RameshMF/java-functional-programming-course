package net.javaguides.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortUserExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Ramesh", 30),
                new User("Umesh", 28),
                new User("Sanjay", 35),
                new User("Pramod", 32),
                new User("Meena", 25)
        );

//        Comparator<User> userComparator = new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };

        // Sort the user by age in ascending order
        List<User> result = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();

        System.out.println(result.toString());

        // Sort the user by age in descending order
        List<User> result1 = users.stream()
                .sorted(Comparator.comparingInt(User::getAge).reversed())
                .toList();

        System.out.println(result1.toString());

        // Sort the user by name in ascending order
        List<User> result2 = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .toList();

        System.out.println(result2.toString());

        // Sort the user by name in desc order
        List<User> result3 = users.stream()
                .sorted(Comparator.comparing(User::getName).reversed())
                .toList();

        System.out.println(result3.toString());

    }
}
