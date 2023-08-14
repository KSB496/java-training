package com.repo;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Movie;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId> {
	
	public Optional<Movie> findMovieByImdbId(String imdbId);
}
