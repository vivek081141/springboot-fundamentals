package org.learning.app.multithreading.basics;

public class User {
    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String gender;
    public String city;


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
