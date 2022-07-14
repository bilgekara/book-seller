package com.bilgeli.bookseller.repository;

import com.bilgeli.bookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
