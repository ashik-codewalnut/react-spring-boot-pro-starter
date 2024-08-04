package com.project.springboot_pro_starter_application.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StarterModel {

    @Id
    @SequenceGenerator(
            name = "starter_sequence",
            sequenceName = "starter_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "starter_sequence"
    )
   private Long id;
   private String message;
}
