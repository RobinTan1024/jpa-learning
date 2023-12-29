package com.learning.springboot.dto.student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {

    private String surname;
    private String givenName;
    private int age;
}
