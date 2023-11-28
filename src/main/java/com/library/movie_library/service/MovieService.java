package com.library.movie_library.service;

import com.library.movie_library.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovie(int id);
}
