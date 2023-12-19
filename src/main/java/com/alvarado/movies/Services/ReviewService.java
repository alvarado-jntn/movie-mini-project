package com.alvarado.movies.Services;

import com.alvarado.movies.Movie;
import com.alvarado.movies.Repositories.ReviewRepository;
import com.alvarado.movies.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    private MongoTemplate mongoTemplate; //This is another way to communicate with the database.

    public Review createReview(String reviewBody, String imbdId){
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imbdId").is(imbdId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
