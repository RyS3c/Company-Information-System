package com.example.Microservices.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "Managers")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    @NotBlank(message = "name is required!")
    private String name;

    @Column(name = "Email")
    @NotBlank(message = "email is required!")
    private String email;

    @Column(name = "Level")
    @NotBlank(message = "Level is required!")
    private String level;


    public Manager() {
        super();
    }

    public Manager(int id, String name, String email, String level) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotBlank(message = "name is required!") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "name is required!") String name) {
        this.name = name;
    }

    public @NotBlank(message = "email is required!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "email is required!") String email) {
        this.email = email;
    }

    public @NotBlank(message = "level is required!") String getLevel() {
        return level;
    }

    public void setLevel(@NotBlank(message = "level is required!") String level) {
        this.level = level;
    }
}
