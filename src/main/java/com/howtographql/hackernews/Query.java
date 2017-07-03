package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

/**
 * Created by bojan.tomic on 7/2/17.
 */
class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }
}
