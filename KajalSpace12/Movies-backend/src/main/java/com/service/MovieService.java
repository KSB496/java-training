package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Movie;
import com.repo.MovieRepo;

@Service
public class MovieService  {

	@Autowired
	private MovieRepo repo;
	
	public List<Movie> loadAll(){
		return repo.findAll();
	}
	
	public Optional<Movie> findMovieByImdbId(String imdb){
		return repo.findMovieByImdbId(imdb);
	}
}
