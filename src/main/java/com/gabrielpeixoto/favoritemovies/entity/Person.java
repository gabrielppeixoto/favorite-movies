package com.gabrielpeixoto.favoritemovies.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String personId;

    @Column(name = "person_name", nullable = false)
    private String nome;
}
