package com.springexamples.repository;

import org.springframework.data.repository.CrudRepository;

import com.springexamples.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
