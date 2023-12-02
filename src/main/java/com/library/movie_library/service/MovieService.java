package com.library.movie_library.service;

import com.library.movie_library.entity.Movie;
import com.library.movie_library.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(final MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Transactional
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Transactional
    public Movie getMovie(final String id) {
        return movieRepository.getReferenceById(id);
    }
}
