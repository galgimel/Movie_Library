package com.library.movie_library.service;

import com.library.movie_library.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> getAllActors();
    Actor getActor(int id);

}
