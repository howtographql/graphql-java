package com.howtographql.hackernews;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import graphql.servlet.GraphQLContext;

/**
 * Created by bojan.tomic on 7/3/17.
 */
public class AuthContext extends GraphQLContext {
    
    private final User user;
    
    public AuthContext(User user, Optional<HttpServletRequest> request, Optional<HttpServletResponse> response) {
        super(request, response);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
