package com.library.movie_library.controller;

import com.library.movie_library.entity.Movie;
import com.library.movie_library.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(final MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public String showAllMovies(final Model model) {
        model.addAttribute(
            "allMovies",
            movieService.getAllMovies().stream()
                .sorted(Comparator.comparing(Movie::getYear).reversed())
                .collect(Collectors.toList())
        );

        return "/movie/all-movies";
    }

    @GetMapping("/{id}")
    public String getMovie(@PathVariable final int id, final Model model) {
        model.addAttribute("movie", movieService.getMovie(id));

        return "/movie/movie-profile";
    }
}
