package com.yourbookapp.bookapp.data;

import com.yourbookapp.bookapp.models.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Integer> {
}
