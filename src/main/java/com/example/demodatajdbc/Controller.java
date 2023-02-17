package com.example.demodatajdbc;

import com.example.demodatajdbc.domain.Author;
import com.example.demodatajdbc.domain.Book;
import com.example.demodatajdbc.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class Controller {

    @Autowired
    BookRepository repo;

    @GetMapping(value = "/t", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object get() {
        Book book1 = new Book();
//        book1.setId(1L);
        book1.setName("Wings of fire");
        book1.setAuthors(Stream.of("Jack", "John", "Jane")
                .map(it -> {
                    Author a = new Author();
                    a.setName(it);
                    return a;
                }).collect(Collectors.toList())
        );

        repo.save(book1);

        System.out.println(book1.getId());

        return repo.findAll();
    }
}
