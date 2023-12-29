package com.learning.springboot.service;

import com.learning.springboot.dto.student.StudentRequest;

public interface StudentService {

    Long addNewStudent(StudentRequest request);
}
