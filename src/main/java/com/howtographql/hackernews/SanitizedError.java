package com.howtographql.hackernews;

import com.fasterxml.jackson.annotation.JsonIgnore;

import graphql.ExceptionWhileDataFetching;

/**
 * Created by bojan.tomic on 7/3/17.
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
