package dev.shadelx.movies.Review;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import dev.shadelx.movies.Movie.Movie;

@Service
public class ReviewService {
  @Autowired
  private ReviewRepository repository;

  @Autowired
  private MongoTemplate mongoTemplate;

  public Review createReview(String reviewBody, String imdbId) {
      Review review = repository.insert(new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));

      mongoTemplate.update(Movie.class)
          .matching(Criteria.where("imdbId").is(imdbId))
          .apply(new Update().push("reviews").value(review))
          .first();
      System.out.println(mongoTemplate);
      return review;
  }

  public void deleteReviews(){
    mongoTemplate.remove(new Query(), Review.class);
  }
}
