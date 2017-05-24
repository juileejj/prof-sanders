package com.nadasanders.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadasanders.entity.BookEntity;
import com.nadasanders.pojo.Book;
import com.nadasanders.repository.BookRepository;
import com.nadasanders.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	 @Autowired
	    private BookRepository bookRepository;

	    @Override
	    public Book addBook(BookEntity toSave) {
	    	Book toPersist = new Book(toSave.getName(),toSave.getImageUrl(), toSave.getLink());
	        toPersist = bookRepository.save(toPersist);
	        return toPersist;
	    }

	    @Override
	    public Book getBook(Long id) {
	    	Book fromDb = bookRepository.findOne(id);
	        if (fromDb != null) {
	            return fromDb;
	        }
	        return null;
	    }

	    @Override
	    public Boolean deleteBook(Long id) {
	    	Book fromDb = bookRepository.findOne(id);
	        if (fromDb != null) {
	        	bookRepository.delete(id);
	            return Boolean.TRUE;
	        }
	        return Boolean.FALSE;
	    }

	@Override
	public Iterable<Book> getAll() {
		return bookRepository.findAll();
	}
}
