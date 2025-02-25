package net.javaguides.streams.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public User(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    
}

public class StreamDistinctUserExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User(1, "Ramesh", "Fadatare", "ramesh@gmail.com"),
                new User(2, "Umesh", "Fadatare", "umesh@gmail.com"),
                new User(1, "Ramesh", "Fadatare", "ramesh@gmail.com"),
                new User(3, "Sanjay", "Pawar", "sanjay@gmail.com"),
                new User(2, "Ram", "Jadhav", "ram@gmail.com")
        );

        List<User> distinctUsers = users.stream()
                .distinct() // remove duplicate user objects -> Stream
                .toList();

        distinctUsers.forEach((user) -> System.out.println(user.toString()));
    }
}
