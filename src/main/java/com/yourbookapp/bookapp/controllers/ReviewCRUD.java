package com.yourbookapp.bookapp.controllers;

import com.yourbookapp.bookapp.models.Review;
import com.yourbookapp.bookapp.services.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewCRUD {
    private final ReviewService reviewService;
    public ReviewCRUD(ReviewService reviewService){
        this.reviewService = reviewService;
    }


    @RequestMapping(value="/api/reviews", method=RequestMethod.POST)
    public Review create(@RequestParam(value="comment") String comment) {
        Review review = new Review( comment );
        return reviewService.createReview(review);
    }

    @RequestMapping(value="/api/reviews/{id}")
    public Review show(@PathVariable("id") Long id) {
        Review review = reviewService.findReview(id);
        return review;
    }

    @RequestMapping("/api/reviews")
    public List<Review> index() {
        return reviewService.allReviews();
    }

    @RequestMapping(value="/api/reviews/{id}", method=RequestMethod.PUT)
    public Review update(@PathVariable("id") Long id, @RequestParam(value="comment") String comment) {
        Review review = new Review(id, comment);
        Review reviewUpdated = reviewService.updateReview(review);
        return reviewUpdated;
    }
    @RequestMapping(value="/api/reviews/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        reviewService.deleteReview(id);
    }
}