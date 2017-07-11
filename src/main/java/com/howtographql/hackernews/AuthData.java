package com.howtographql.hackernews;

/**
 * A wrapper around the email and password
 */
public class AuthData {

    private String email;
    private String password;

    public AuthData() {
    }

    public AuthData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
