package com.example.demodatajdbc.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Book {
    @Id
    private Long id;

    private String name;

    private List<Author> authors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
