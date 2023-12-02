package com.library.movie_library.service;

import com.library.movie_library.entity.Director;
import com.library.movie_library.repository.DirectorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DirectorService {
    private final DirectorRepository directorRepository;

    public DirectorService(final DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Transactional
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    @Transactional
    public Director getDirector(final String id) {
        return directorRepository.getReferenceById(id);
    }
}
