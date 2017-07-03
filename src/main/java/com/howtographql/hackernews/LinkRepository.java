package com.howtographql.hackernews;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

/**
 * Created by bojan.tomic on 7/2/17.
 */
public class LinkRepository {
    
    private final MongoCollection<Document> links;

    public LinkRepository(MongoCollection<Document> links) {
        this.links = links;
    }

    public Link findById(String id) {
        Document doc = links.find(eq("_id", new ObjectId(id))).first();
        return link(doc);
    }
    
    public List<Link> getAllLinks() {
        links.deleteOne(Filters.eq("_id", new ObjectId("59592cd33b067a54782a64d5")));
        links.deleteOne(Filters.eq("_id", new ObjectId("595932443b067a54782a64d6")));
        List<Link> allLinks = new ArrayList<>();
        for (Document doc : links.find()) {
            allLinks.add(link(doc));
        }
        return allLinks;
    }
    
    public void saveLink(Link link) {
        Document doc = new Document();
        doc.append("url", link.getUrl());
        doc.append("description", link.getDescription());
        doc.append("postedBy", link.getUserId());
        links.insertOne(doc);
    }
    
    private Link link(Document doc) {
        return new Link(
                doc.get("_id").toString(),
                doc.getString("url"),
                doc.getString("description"),
                doc.getString("postedBy"));
    }
}
