package com.learning.springboot.controller;

import com.learning.springboot.dto.common.HttpStandardResponse;
import com.learning.springboot.dto.klass.KlassRequest;
import com.learning.springboot.dto.student.StudentRequest;
import com.learning.springboot.dto.student.StudentResponse;
import com.learning.springboot.service.impl.KlassServiceImpl;
import com.learning.springboot.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class DemoController {

    @Autowired
    private KlassServiceImpl klassService;

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping(value = "/classes", consumes = MimeTypeUtils.APPLICATION_JSON_VALUE, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public HttpStandardResponse<StudentResponse> createClass(@RequestBody KlassRequest request) {
        Long studentId = klassService.addNewKlass(request);

        StudentResponse response = new StudentResponse();
        response.setId(studentId);
        return new HttpStandardResponse<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/students", consumes = MimeTypeUtils.APPLICATION_JSON_VALUE, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public HttpStandardResponse<StudentResponse> createClass(@RequestBody StudentRequest studentRequest) {
        Long studentId = studentService.addNewStudent(studentRequest);

        StudentResponse response = new StudentResponse();
        response.setId(studentId);
        return new HttpStandardResponse<>(response, HttpStatus.OK);
    }
}
