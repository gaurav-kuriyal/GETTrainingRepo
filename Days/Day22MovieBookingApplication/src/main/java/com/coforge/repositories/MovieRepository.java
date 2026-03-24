package com.coforge.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.coforge.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	public List<Movie> findByLanguage(@Param("language") String language);
}
