package com.library.movie_library.service;

import com.library.movie_library.entity.Actor;
import com.library.movie_library.repository.ActorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;

    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    @Transactional
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @Override
    @Transactional
    public Actor getActor(int id) {
        return actorRepository.getReferenceById(id);
    }
}
