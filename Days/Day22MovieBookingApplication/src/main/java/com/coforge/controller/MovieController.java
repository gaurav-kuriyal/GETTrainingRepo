package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Movie;
import com.coforge.services.MovieService;

@RestController
public class MovieController {
	@Autowired
	MovieService movieService;
	
	@GetMapping("/")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@PostMapping("/")
	public Movie addMovie(@RequestBody Movie movie){
		return movieService.addMovie(movie);
	}
	
	@GetMapping("/{movieId}")
	public Movie getMovieById(@PathVariable("movieId") long movieId){
		return movieService.getMovieById(movieId);
	}
	
	@GetMapping("/language/{lang}")
	public List<Movie> findByLanguage(@PathVariable("lang") String lang){
		return movieService.findByLanguage(lang);
	}
	
}
