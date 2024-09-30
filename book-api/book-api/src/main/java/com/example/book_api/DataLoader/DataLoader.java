package com.example.book_api.service;

import com.example.book_api.model.Book;
import com.example.book_api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        bookRepository.saveAll(Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 4.5),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 4.7),
                new Book("1984", "George Orwell", 1949, 4.8),
                new Book("Pride and Prejudice", "Jane Austen", 1813, 4.6),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 4.0)
        ));
    }
}
