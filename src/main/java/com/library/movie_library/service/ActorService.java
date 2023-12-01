package com.library.movie_library.service;

import com.library.movie_library.entity.Actor;
import com.library.movie_library.repository.ActorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository actorRepository;

    public ActorService(final ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Transactional
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @Transactional
    public Actor getActor(final int id) {
        return actorRepository.getReferenceById(id);
    }
}
