package com.library.movie_library.controller;

import com.library.movie_library.entity.Actor;
import com.library.movie_library.service.ActorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/actors")
public class ActorController {


    private final ActorService actorService;

    public ActorController(final ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public String showAllActors(final Model model) {
        model.addAttribute(
            "allActors",
            actorService.getAllActors().stream()
                .sorted(Comparator.comparing(Actor::getSurname))
                .collect(Collectors.toList())
        );

        return "/actor/all-actors";
    }

    @GetMapping("/{id}")
    public String getActor(@PathVariable final int id, final Model model) {
        model.addAttribute("actor", actorService.getActor(id));

        return "/actor/actor-profile";
    }
}
