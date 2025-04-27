package org.example;

public class UserRegistration {
    public void registerUser(String username, String email, String password) {
        if (username == null || email == null || password == null) throw new IllegalArgumentException();
        if (!email.contains("@")) throw new IllegalArgumentException();
        if (password.length() < 6) throw new IllegalArgumentException();
    }
}
