package com.project.springboot_pro_starter_application;

import com.project.springboot_pro_starter_application.models.StarterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Modify the repository's name and functionality as needed
@Repository
public interface StarterRepository extends JpaRepository<StarterModel, Long> {
}
