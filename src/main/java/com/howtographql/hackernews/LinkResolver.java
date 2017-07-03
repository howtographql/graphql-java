package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * Created by bojan.tomic on 7/3/17.
 */
public class LinkResolver implements GraphQLResolver<Link> {
    
    private final UserRepository userRepository;

    public LinkResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User postedBy(Link link) {
        if (link.getUserId() == null) {
            return new User("", "", "", "");
        }
        return userRepository.findById(link.getUserId());
    }
}
