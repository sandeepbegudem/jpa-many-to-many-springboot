package com.codin9ninja.jpamanytomany.service;

import com.codin9ninja.jpamanytomany.entity.Student;
import com.codin9ninja.jpamanytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getAStudentById(Long studentId){
        return studentRepository.findById(studentId);
    }

    public List<Student> retrieveStudentByName(String studentName){
        return studentRepository.findByStudentName(studentName);
    }
}
