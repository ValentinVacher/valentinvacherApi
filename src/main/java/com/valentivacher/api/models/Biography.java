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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Biography() {
    }

    public Biography(String city, String phoneNumber, String biography) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.biography = biography;
    }
}
