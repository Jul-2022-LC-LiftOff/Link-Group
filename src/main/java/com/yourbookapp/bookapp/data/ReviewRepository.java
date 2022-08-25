package com.yourbookapp.bookapp.data;

import com.yourbookapp.bookapp.models.MyBooks;
import com.yourbookapp.bookapp.models.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
    List<Review> findAll();

    Review save(Review b);

    Optional<Review> findById(Long id);

    void deleteById(Long id);
}
