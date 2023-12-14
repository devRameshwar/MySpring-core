package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.student.Entity.StudentEntity;

@Component
public interface StudentRepository extends JpaRepository<StudentEntity, String> {

}
