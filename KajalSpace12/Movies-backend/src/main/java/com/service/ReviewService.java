package com.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.model.Movie;
import com.model.Review;
import com.repo.ReviewRepo;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepo repo;
	
	@Autowired
	private MongoTemplate template;
	
	public Review createReview(String body, String id) {
		Review review = repo.insert(new Review(body, LocalDateTime.now(), LocalDateTime.now()));
		template.update(Movie.class).matching(Criteria.where("imdbId").is(id))
		.apply(new Update().push("reviews").value(review)).first();
		return review;
	}
}
