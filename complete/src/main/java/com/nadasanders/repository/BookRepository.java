package com.nadasanders.repository;

import org.springframework.data.repository.CrudRepository;

import com.nadasanders.pojo.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
