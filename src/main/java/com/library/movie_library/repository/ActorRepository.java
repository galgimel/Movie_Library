package com.library.movie_library.repository;

import com.library.movie_library.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
    Actor getReferenceById(String id);
}