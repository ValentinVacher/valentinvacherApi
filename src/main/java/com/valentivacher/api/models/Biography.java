package com.valentivacher.api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "biography")
public class Biography {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir une ville de résidence")
    private String city;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un numéro de telephone")
    private String phoneNumber;

    @Column(nullable = false, columnDefinition="Text")
    @NotBlank(message = "Veuillez saisir une biographi")
    private String Biography;
}
