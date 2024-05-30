package com.example;

public class App {
    public static void main(String[] args) {
        String dbUsername = System.getProperty("db.username");
        String dbPassword = System.getProperty("db.password");

        System.out.println("Database Username: " + dbUsername);
        System.out.println("Database Password: " + dbPassword);
    }
}
