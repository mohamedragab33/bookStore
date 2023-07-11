package com.bookstore.controllers;

import com.bookstore.entity.Book;
import com.bookstore.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BooksController {

    @Autowired
    private BooksService booksService;


    @GetMapping("/books")
    public List<Book> getUsers() {
        return booksService.getAllBooks();
    }


}
