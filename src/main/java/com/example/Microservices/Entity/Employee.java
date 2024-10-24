package com.example.Microservices.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotBlank(message = "name is required!")
    private String name;

    @Column(name = "email")
    @NotBlank(message = "email is required!")
    private String email;

    @Column(name = "age")
    @NotBlank(message = "age is required!")
    private String age;

    @Column(name = "position")
    @NotBlank(message = "positon is required!")
    private String position;


    public Employee (){
        super();
    }

    public Employee(int id, String name, String email, String age, String position) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public @NotBlank(message = "positon is required!") String getPosition() {
        return position;
    }

    public void setPosition(@NotBlank(message = "positon is required!") String position) {
        this.position = position;
    }
}
