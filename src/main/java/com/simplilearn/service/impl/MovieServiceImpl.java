package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Movie;
import com.simplilearn.repository.MovieRepository;
import com.simplilearn.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieRepository movieRepo;

	@Override
	public Movie addMovie(Movie movie) {
		return movieRepo.save(movie);
	}

	@Override
	public List<Movie> findAll() {
		
		return movieRepo.findAll();
	}

	@Override
	public Movie findById(Long id) {
		Optional<Movie> movie = movieRepo.findById(id);
		if (movie.isPresent()) {
			return movie.get();
		}
		return null;
	}

	@Override
	public List<Movie> findByLang(String lang) {
		
		return movieRepo.findByLang(lang);
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		
		return movieRepo.findByGenre(genre);
	}

	@Override
	public Movie findByName(String name) {
		return movieRepo.findByName(name);
	}

	@Override
	public Movie updateMovie(Long id, Movie movie) {
		Optional<Movie> movie1 = movieRepo.findById(id);
		if (movie1.isPresent()) {
			return movieRepo.save(movie);
		}
		return null;
	}

	@Override
	public Movie deleteMovie(Long id) {
		movieRepo.deleteById(id);
		return null;
	}

	
	

}
