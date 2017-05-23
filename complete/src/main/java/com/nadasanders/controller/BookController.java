package com.nadasanders.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nadasanders.entity.BookEntity;
import com.nadasanders.pojo.Book;
import com.nadasanders.service.BookService;

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody BookEntity bookEntity, HttpServletResponse response) throws IOException {
    	Book saved = bookService.addBook(bookEntity);
        if (saved != null) {
            return saved;
        } else {
            response.sendError(500, "Can not create Book");
            return null;
        }
    }

    @GetMapping
    public Book getBook(@RequestParam Long bookId, HttpServletResponse response) throws IOException {
    	Book book = bookService.getBook(bookId);
        if (book != null) {
            return book;
        } else {
            response.sendError(404, "Can not locate Book record in database");
            return null;
        }
    }

    @DeleteMapping
    public Boolean deleteBook(@RequestParam Long bookId, HttpServletResponse response) throws IOException {
        Boolean result = bookService.deleteBook(bookId);
        if (result) {
            return true;
        } else {
            response.sendError(404, "Can not locate Book record in database");
            return false;
        }
    }
}
