package com.codin9ninja.jpamanytomany.repository;

import com.codin9ninja.jpamanytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student>findByStudentName(String studentName);
}
