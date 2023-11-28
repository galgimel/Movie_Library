package com.library.movie_library.service;

import com.library.movie_library.entity.Director;

import java.util.List;

public interface DirectorService {
    List<Director> getAllDirectors();
    Director getDirector(int id);
}
