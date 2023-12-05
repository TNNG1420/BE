package com.example.startl.repository;

import com.example.startl.model.Content;
import com.example.startl.model.Status;
import com.example.startl.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contents = new ArrayList<>();

    public ContentCollectionRepository() {

    }
    public List<Content> findAll() {
        return contents;
    }

    public Optional<Content> findById(Integer id) {
        return contents.stream().filter(c-> c.id().equals(id)).findFirst();

    }

    @PostConstruct
    private void init() {
        Content c = new Content(1, "First Post", "description", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), null, "");
        contents.add(c);
    }

    public void save(Content content) {
        contents.add(content);
    }
}
