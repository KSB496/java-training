package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Movie;
import com.service.MovieService;

@RestController
@RequestMapping("/loadmovies")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public ResponseEntity<List<Movie>> loadAll(){
		return new ResponseEntity<>(service.loadAll(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Movie>> findMovieByImdbId(@PathVariable String id){
		return new ResponseEntity<Optional<Movie>>(service.findMovieByImdbId(id),HttpStatus.OK);
	}
}
