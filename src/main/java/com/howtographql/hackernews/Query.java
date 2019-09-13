package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

/**
 * Query root. Contains top-level queries.
 */
class Query implements GraphQLQueryResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks(LinkFilter filter, Number skip, Number first) {
        return linkRepository.getAllLinks(filter, skip.intValue(), first.intValue());
    }
}
