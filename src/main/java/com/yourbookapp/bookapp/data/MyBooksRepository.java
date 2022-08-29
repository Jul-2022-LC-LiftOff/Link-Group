package com.yourbookapp.bookapp.data;

import com.yourbookapp.bookapp.models.MyBooks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBooksRepository extends CrudRepository<MyBooks, Long> {

}
