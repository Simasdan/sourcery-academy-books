package com.books.Books.controller;

import com.books.Books.model.Book;
import com.books.Books.repository.MySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Optional;
import java.util.List;

@RestController
public class BooksController {

    @Autowired
    MySqlRepository mySqlRepository;

    @GetMapping("/get-all-books")
    public List<Book> getAllBooks() {
        return mySqlRepository.findAll();
    }

    @GetMapping("/get-book/{id}")
    public Book getSingleBook(@PathVariable("id") Integer id){
        return mySqlRepository.findById(id).get();
    }

    @DeleteMapping("/remove/{id}")
    public boolean deleteRow(@PathVariable("id") Integer id) {
        if(!mySqlRepository.findById(id).equals(Optional.empty())) {
            mySqlRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable("id") Integer id,
                            @RequestBody Map<String, String> body) {
        Book current = mySqlRepository.findById(id).get();
        current.setTitle(body.get("title"));
        current.setYear(Integer.parseInt(body.get("year")));
        current.setAuthor(body.get("author"));
        current.setRating(Double.parseDouble(body.get("rating")));
        mySqlRepository.save(current);
        return current;
    }

    @PostMapping("/add")
    public Book createBook(@RequestBody Map<String, String> body) {
        String title = body.get("title");
        Integer year = Integer.parseInt(body.get("year"));
        String author = body.get("author");
        Double rating = Double.parseDouble((body.get("rating")));
        Book newBook = new Book(title, year, author, rating);

        return mySqlRepository.save(newBook);
    }

    @PostMapping("/rate/{id}")
    public Book rateBook(@PathVariable("id") Integer id,
                         @RequestBody Map<String, Double> body) {
        Double newRating = body.get("rating");
        Book current = mySqlRepository.findById(id).get();

        if (newRating >= 1 && newRating <= 5) {
            double totalRating = current.getRating() * current.getRatingCount();
            current.setRatingCount(current.getRatingCount() + 1);
            double newAverageRating = (totalRating + newRating) / current.getRatingCount();
            current.setRating(newAverageRating);
            mySqlRepository.save(current);
        }
        return current;
    }

    @GetMapping("/filter")
    public List<Book> filterBooks(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) Integer year,
            @RequestParam(required = false) String author,
            @RequestParam(required = false) Double rating,
            @RequestParam(required = false) Double minRating,
            @RequestParam(required = false) Integer minYear) {

        if (title != null) {
            return mySqlRepository.findByTitleContainingIgnoreCase(title);
        } else if (year != null) {
            return mySqlRepository.findByYear(year);
        } else if (author != null) {
            return mySqlRepository.findByAuthorContainingIgnoreCase(author);
        } else if (rating != null) {
            return mySqlRepository.findByRating(rating);
        } else if (minRating != null) {
            return mySqlRepository.findByRatingGreaterThan(minRating);
        } else if (minYear != null) {
            return mySqlRepository.findByYearGreaterThan(minYear);
        } else {
            return mySqlRepository.findAll();
        }
    }
}
