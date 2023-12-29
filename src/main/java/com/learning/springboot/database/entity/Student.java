package com.learning.springboot.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "given_name")
    private String givenName;

    @Column(name = "age")
    private int age;
}
