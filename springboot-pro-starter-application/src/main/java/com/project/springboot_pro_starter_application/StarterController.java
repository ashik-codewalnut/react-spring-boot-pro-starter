package com.project.springboot_pro_starter_application;

import com.project.springboot_pro_starter_application.models.StarterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
// Modify the controller's name and functionality as needed
public class StarterController {

    @Autowired
    private StarterService service;

    @GetMapping
    public ResponseEntity<StarterModel> getMessage() {
        return ResponseEntity.ok(service.getMessage());
    }

    // Add additional methods to the controller as required
}
