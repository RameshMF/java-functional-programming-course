package net.javaguides.streams.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class UserDTO {
    private int id;
    private String username;
    private String email;

    public UserDTO(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class MapCustomObjectExample {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ramesh", "ramesh123456", "ramesh@gmail.com"));
        users.add(new User(2, "Ram", "ram123456", "ram@gmail.com"));
        users.add(new User(3, "Sanjay", "sanjay123456", "sanjay@gmail.com"));

//        List<String> emailIds = users.stream()
//                .peek((user) -> System.out.println(user.toString()))
//                .map((user) -> user.getEmail())
//                .peek((element) -> System.out.println(element))
//                .toList();
//
//        System.out.println(emailIds);

        Stream<User> stream = users.stream();
        List<UserDTO> list = stream.map((user) -> new UserDTO(user.getId(), user.getUsername(), user.getEmail()))
                .toList();

        list.forEach((element) -> System.out.println(element.toString()));
    }
}
