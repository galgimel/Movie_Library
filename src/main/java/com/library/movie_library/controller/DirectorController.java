package com.library.movie_library.controller;

import com.library.movie_library.entity.Director;
import com.library.movie_library.service.DirectorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/directors")
public class DirectorController {
    private final DirectorService directorService;

    public DirectorController(final DirectorService directorService) {
        this.directorService = directorService;
    }

    @GetMapping
    public String showAllDirectors(final Model model) {
        model.addAttribute(
            "allDirectors",
            directorService.getAllDirectors().stream()
                .sorted(Comparator.comparing(Director::getSurname))
                .collect(Collectors.toList())
        );

    return "/director/all-directors";
    }

    @GetMapping("/{id}")
    public String getDirector(@PathVariable final int id, final Model model) {
       if (id == 0) {
           return "redirect:/directors";
       }
       model.addAttribute("director", directorService.getDirector(id));

       return "/director/director-profile";
    }
}
