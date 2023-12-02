package com.library.movie_library.repository;

import com.library.movie_library.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Integer> {
    Director getReferenceById(String id);
}