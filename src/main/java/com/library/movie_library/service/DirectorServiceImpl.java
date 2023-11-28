package com.library.movie_library.service;

import com.library.movie_library.entity.Director;
import com.library.movie_library.repository.DirectorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {
    private final DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    @Transactional
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    @Override
    @Transactional
    public Director getDirector(int id) {
        return directorRepository.getReferenceById(id);
    }
}
