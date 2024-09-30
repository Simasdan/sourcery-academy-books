package com.books.Books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.books.Books.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MySqlRepository extends JpaRepository<Book, Integer>{

    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByYear(Integer year);
    List<Book> findByAuthorContainingIgnoreCase(String author);
    List<Book> findByRating(Double rating);
    List<Book> findByRatingGreaterThan(Double rating);
    List<Book> findByYearGreaterThan(Integer year);
}

