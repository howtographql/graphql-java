package com.howtographql.hackernews;

/**
 * Represents a logged in user and the token to be used to authenticate subsequent requests
 */
public class SigninPayload {
    
    private final String token;
    private final User user;

    public SigninPayload(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public User getUser() {
        return user;
    }
}
