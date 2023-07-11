package com.bookstore.service.Impl;

import com.bookstore.dtos.BookDTO;
import com.bookstore.entity.Book;
import com.bookstore.repository.BooksRepository;
import com.bookstore.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {


    @Autowired
    private BooksRepository booksRepository;

    @Override
    public void createBook(BookDTO bookDTO) {

    }

    @Override
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public Book getBookByNameOrId(String name) {
        return null;
    }


    @Override
    public void deleteBook(long id) {

    }

    @Override
    public Book updateBook(BookDTO bookDTO) {
        return null;
    }

}