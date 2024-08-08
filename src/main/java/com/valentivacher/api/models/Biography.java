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

    @Column(nullable = false, columnDefinition = "Text")
    @NotBlank(message = "Veuillez saisir une biographi")
    private String biography;

    public Biography() {
    }

    public Biography(String city, String phoneNumber, String biography) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.biography = biography;
    }

    public Biography(long id, String city, String phoneNumber, String biography) {
        this.id = id;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.biography = biography;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotBlank(message = "Veuillez saisir une ville de résidence") String getCity() {
        return city;
    }

    public void setCity(@NotBlank(message = "Veuillez saisir une ville de résidence") String city) {
        this.city = city;
    }

    public @NotBlank(message = "Veuillez saisir un numéro de telephone") String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NotBlank(message = "Veuillez saisir un numéro de telephone") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public @NotBlank(message = "Veuillez saisir une biographi") String getBiography() {
        return biography;
    }

    public void setBiography(@NotBlank(message = "Veuillez saisir une biographi") String biography) {
        this.biography = biography;
    }
}
