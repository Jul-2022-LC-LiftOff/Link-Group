package com.yourbookapp.bookapp.services;


import com.yourbookapp.bookapp.data.ReviewRepository;
import com.yourbookapp.bookapp.models.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) { this.reviewRepository = reviewRepository; }


    public Review createReview(Review b) {return reviewRepository.save(b);}


    public List<Review> allReviews(){ return reviewRepository.findAll();}

    public Review findReview (Long id){
        Optional<Review> optionalReview = reviewRepository.findById(id);
        if(optionalReview.isPresent()){
            return optionalReview.get();
        } else {
            return null;
        }
    }


    public Review updateReview(Review b) { return reviewRepository.save(b);}


    public void deleteReview(Long id) {reviewRepository.deleteById(id);}
}
