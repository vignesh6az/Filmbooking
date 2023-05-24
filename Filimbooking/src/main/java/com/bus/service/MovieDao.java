package com.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bus.beans.Customer;
import com.bus.beans.MovieDetails;

@Component
public class MovieDao 
{

	@Autowired
	private MovieRepo repo;
	
	
    public int savemovie(MovieDetails moviedetais) {
		
		repo.save(moviedetais);
		return 1;
		
	}
    
    public List<MovieDetails> getAllMovies() {
		return repo.findAll();
	}

public int deletemovie(Long  id) {
		
		repo.deleteById(id);
		return 1;
		
	}
	
}
