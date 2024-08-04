package com.project.springboot_pro_starter_application;

import com.project.springboot_pro_starter_application.models.StarterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

// Modify the service's name and functionality as needed
@Service
public class StarterService {

    @Autowired
    private StarterRepository repository;

    public StarterModel getMessage() {
        Optional<StarterModel> starterModel = repository.findAll().stream().findFirst();
        return starterModel.orElseGet(() -> StarterModel.builder().build());
    }

    // Add additional methods to the service as required
}
