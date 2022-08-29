package com.yourbookapp.bookapp.data;

import com.yourbookapp.bookapp.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Iterable<Book> findByNameContains(String searchString);
}
