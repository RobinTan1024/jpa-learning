package com.learning.springboot.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "klass")
public class Klass {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "klass_id_generator")
    @TableGenerator(name = "klass_id_generator", table = "pk_id", pkColumnName = "pk_name", pkColumnValue = "klass_id", valueColumnName = "pk_value")
    private Long id;

    @Column(name = "grade")
    private int grade;

    @Column(name = "class_no")
    private int classNo;

    @Column(name = "name")
    private String name;
}
