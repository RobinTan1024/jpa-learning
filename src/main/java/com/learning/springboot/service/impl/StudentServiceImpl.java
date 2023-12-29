package com.learning.springboot.service.impl;

import com.learning.springboot.database.dao.StudentRepo;
import com.learning.springboot.database.entity.Student;
import com.learning.springboot.dto.student.StudentRequest;
import com.learning.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Long addNewStudent(StudentRequest request) {
        Student studentEntity = new Student();
        studentEntity.setSurname(request.getSurname());
        studentEntity.setGivenName(request.getGivenName());
        studentEntity.setAge(request.getAge());
        studentEntity.setId(System.currentTimeMillis());
        Student newEntity = studentRepo.saveAndFlush(studentEntity);
        return newEntity.getId();
    }
}
