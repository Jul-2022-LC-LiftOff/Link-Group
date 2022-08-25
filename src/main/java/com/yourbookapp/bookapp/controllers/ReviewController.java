package com.yourbookapp.bookapp.controllers;


import com.yourbookapp.bookapp.data.ReviewRepository;
import com.yourbookapp.bookapp.models.Review;
import com.yourbookapp.bookapp.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ReviewController {
  @Autowired
  private ReviewRepository reviewRepository;
  
  private final ReviewService reviewService;

  private Long id;

  public ReviewController(ReviewService reviewService) {this.reviewService = reviewService; }
/*
  @GetMapping
  public String index(Model model){
    model.addAttribute("review", reviewRepository.findAll());
    return "index";
  }

  @GetMapping("/api/reviews")
  public Review create(@RequestParam(value="comment") String comment) {
    Review review = new Review( comment );
    return reviewService.createReview(review);
  }

  @PostMapping("/api/reviews")
  public Review findReview (Long id) {
    Optional<Review> optionalReview = reviewRepository.findById(id);
    if (optionalReview.isPresent()) {
      return optionalReview.get();
    } else {
      return null;
    }
  }
  @GetMapping("/api/reviews/{id}")
  public Review show(@PathVariable("id") Long id) {
    Review review = reviewService.findReview(id);
    return review;
  }

  @PostMapping("/api/reviews/{id}")
  public Review update(@PathVariable("id") Long id, @RequestParam(value="comment") String comment) {
    Review review = new Review(id, comment);
    Review reviewUpdated = reviewService.updateReview(review);
    return reviewUpdated;
  }

*/
}
