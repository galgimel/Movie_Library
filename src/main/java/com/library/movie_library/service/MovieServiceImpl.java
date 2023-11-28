package com.library.movie_library.service;

import com.library.movie_library.entity.Movie;
import com.library.movie_library.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    @Transactional
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    @Transactional
    public Movie getMovie(int id) {
        return movieRepository.getReferenceById(id);
    }
}
