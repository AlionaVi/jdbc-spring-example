package ru.itgirl.jdbcspringexample.repository;

import ru.itgirl.jdbcspringexample.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    List<Book> findOneBook(Long id);
}
