package com.codin9ninja.jpamanytomany.service;

import com.codin9ninja.jpamanytomany.entity.Student;
import com.codin9ninja.jpamanytomany.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        LOGGER.info("student id: {} has been saved successfully." ,student.getStudentId());
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getAStudentById(Long studentId){
        LOGGER.info("student id: {} has been retrieved." ,studentId);
        return studentRepository.findById(studentId);
    }

    public List<Student> retrieveStudentByName(String studentName){
        return studentRepository.findByStudentName(studentName);
    }
}
