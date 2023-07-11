package com.bookstore.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class BookDTO {
    private String name;
    private String author;
    private Date publishDate;
    private double price;
    private String imagesUrl;
}
