package com.valentivacher.api.services;

import com.valentivacher.api.models.Biography;
import com.valentivacher.api.repositories.BiographyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiographyService {
    @Autowired
    BiographyRepository biographyRepository;

    public Biography getBiography() {
        return biographyRepository.findFirstByOrderByIdDesc();
    }

    public Biography addBiography(Biography biography) {
        return biographyRepository.save(biography);
    }
}
