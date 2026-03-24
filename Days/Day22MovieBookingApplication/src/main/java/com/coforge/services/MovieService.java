package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.MovieDao;
import com.coforge.entities.Movie;

@Service
public class MovieService {
	@Autowired
	MovieDao movieDao;
	
	public List<Movie> getAllMovies(){
		return movieDao.getAllMovies();
	}

	public Movie addMovie(Movie movie){
		return movieDao.addMovie(movie);
	}

	public Movie getMovieById(long id){
		return movieDao.getMovieById(id).get();
	}
	
	public List<Movie> findByLanguage(String language){
		return movieDao.findByLanguage(language);
	}
}
