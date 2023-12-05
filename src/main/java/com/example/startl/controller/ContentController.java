package com.example.startl.controller;

import com.example.startl.model.Content;
import com.example.startl.repository.ContentCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository repository;

    @Autowired
    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("")
    public List<Content> findAll() {
        return repository.findAll();

//    public  ContentController(ContentCollectionRepository contentCollectionRepository) {
////        repository = new ContentCollectionRepository();
//        this.repository = contentCollectionRepository;
    }

    // Create Read Update Delete - filter / paging

    @GetMapping("/{id}")
    public Content finById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found!"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody Content content) {
        repository.save(content);
    }

}
