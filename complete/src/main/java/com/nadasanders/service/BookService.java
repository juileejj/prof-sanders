package com.nadasanders.service;

import com.nadasanders.entity.BookEntity;
import com.nadasanders.pojo.Book;

public interface BookService {

	/**
     * Adds Book to the database
     *
     * @param toSave is BookEntity
     * @return the about pojo saved in database
     */
	Book addBook(BookEntity toSave);

    /**
     * Get Book pojo from db
     *
     * @param id to locate in db
     * @return the about pojo saved in database
     */
	Book getBook(Long id);

    /**
     * Delete Book from db
     *
     * @param id to locate in db
     * @return true if deleted
     */
    Boolean deleteBook(Long id);

    Iterable<Book> getAll();
}
