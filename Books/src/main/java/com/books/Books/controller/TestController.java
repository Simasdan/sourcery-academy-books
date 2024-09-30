package com.books.Books.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String getHome() {
        return "Home";
    }

    @GetMapping("/test")
    public String getTest() {
        return "Test";
    }

    @GetMapping("/book")
        public Book getBook() {

            Book b1 = new Book();
            b1.setTitle("Lord of the Rings - The Fellowship of the Ring");
            b1.setYear(1954);
            b1.setAuthor("J. R. R. Tolkien");
            b1.setRating(5.0);
            b1.setRatingCount(1);
            return b1;

        }
    }

class Book {

    private String title;
    private Integer year;
    private String author;
    private Double rating;
    private Integer ratingCount = 1;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }
}
