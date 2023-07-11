package com.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "books_tb")
@NoArgsConstructor
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String name ;
    private String author ;
    @Column(name = "publish_date")
    private Date publishDate ;
    private double price ;
    private String imageUrl ;

    public Book(String name, String author, Date publishDate, double price, String imageUrl) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
        this.imageUrl = imageUrl;
    }
}
