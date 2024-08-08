package com.valentivacher.api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.GregorianCalendar;

@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir un titre")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Veuillez saisir une date")
    private GregorianCalendar date;

    @Column(nullable = false, columnDefinition = "Text")
    @NotBlank(message = "Veuillez saisir une description")
    private String description;

    public Activity() {
    }

    public Activity(String title, GregorianCalendar date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public Activity(long id, String title, GregorianCalendar date, String description) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotBlank(message = "Veuillez saisir un titre") String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank(message = "Veuillez saisir un titre") String title) {
        this.title = title;
    }

    public @NotBlank(message = "Veuillez saisir une date") GregorianCalendar getDate() {
        return date;
    }

    public void setDate(@NotBlank(message = "Veuillez saisir une date") GregorianCalendar date) {
        this.date = date;
    }

    public @NotBlank(message = "Veuillez saisir une description") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Veuillez saisir une description") String description) {
        this.description = description;
    }
}
