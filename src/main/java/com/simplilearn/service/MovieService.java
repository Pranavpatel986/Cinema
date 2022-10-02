package com.simplilearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Movie;

@Service
public interface MovieService {
Movie addMovie(Movie movie);

List<Movie> findAll();
Movie findById (Long id);
List<Movie> findByLang(String lang);
List<Movie> findByGenre (String genre);
Movie findByName (String name);

Movie updateMovie(Long id, Movie movie);

Movie deleteMovie(Long id);

	
}
