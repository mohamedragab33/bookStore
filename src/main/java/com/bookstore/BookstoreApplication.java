package com.bookstore;

import com.bookstore.entity.Book;
import com.bookstore.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}


	@Bean
	CommandLineRunner init(BooksRepository booksRepository) {
		return args -> {

			List<Book> books = new ArrayList<>();
			Book book1 = new Book("JAVA" , "Antony", new Date(),1200.00,"https://www.pexels.com/photo/person-in-gray-shirt-holding-a-small-paper-with-texts-11035547/");
			Book book2 = new Book("C#" , "George", new Date(),1600.00,"https://developers.redhat.com/sites/default/files/styles/article_feature/public/blog/2021/03/2021_C9_top-level_programs_target-typed_Featured_article_image_A-01.png?itok=hN4XnLJr");
			Book book3 = new Book("C++" , "Antony", new Date(),1800.00,"https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230703144619/CPP-Language.png");
            books.add(book1);
            books.add(book2);
            books.add(book3);
			booksRepository.saveAll(books);
			booksRepository.findAll().forEach(System.out::println);
		};
	}

}
