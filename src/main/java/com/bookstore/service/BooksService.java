package com.bookstore.service;

import com.bookstore.dtos.BookDTO;
import com.bookstore.entity.Book;

import java.util.List;

public interface BooksService {
    void createBook(BookDTO bookDTO);
    List<Book> getAllBooks();
    Book getBookByNameOrId(String name);
    void deleteBook(long id);
    Book updateBook(BookDTO bookDTO);

}
