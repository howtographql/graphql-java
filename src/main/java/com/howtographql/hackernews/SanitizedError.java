package com.howtographql.hackernews;

import com.fasterxml.jackson.annotation.JsonIgnore;

import graphql.ExceptionWhileDataFetching;

/**
 * A simple wrapper that prevents stack traces from reaching the client 
 */
public class SanitizedError extends ExceptionWhileDataFetching {
    
    public SanitizedError(ExceptionWhileDataFetching inner) {
        super(inner.getException());
    }

    @Override
    @JsonIgnore
    public Throwable getException() {
        return super.getException();
    }
}
