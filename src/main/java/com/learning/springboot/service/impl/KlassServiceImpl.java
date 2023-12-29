package com.learning.springboot.service.impl;

import com.learning.springboot.database.dao.StudentRepo;
import com.learning.springboot.database.entity.Student;
import com.learning.springboot.dto.klass.KlassRequest;
import com.learning.springboot.dto.student.StudentRequest;
import com.learning.springboot.service.KlassService;
import com.learning.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KlassServiceImpl implements KlassService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Long addNewKlass(KlassRequest request) {
        return null;
    }
}
