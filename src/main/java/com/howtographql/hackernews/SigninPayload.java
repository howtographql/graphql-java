package com.howtographql.hackernews;

/**
 * Created by bojan.tomic on 7/3/17.
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
