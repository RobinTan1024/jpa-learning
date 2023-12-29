package com.learning.springboot.database.dao;

import com.learning.springboot.database.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
