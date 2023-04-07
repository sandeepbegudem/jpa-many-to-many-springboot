package com.codin9ninja.jpamanytomany.controller;

import com.codin9ninja.jpamanytomany.entity.Course;
import com.codin9ninja.jpamanytomany.entity.Student;
import com.codin9ninja.jpamanytomany.repository.CourseRepository;
import com.codin9ninja.jpamanytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/students/course")
public class StudentCourseController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/save")
    public Student addStudent(@RequestBody Student student){


        return studentService.saveStudent(student);
    }

    @GetMapping("/all-students")
    public List<Student> retrieveAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/find/{studentId}")
    public Optional<Student> findStudent(@PathVariable Long studentId){
        return studentService.getAStudentById(studentId);
    }

    @GetMapping("/student-details/{studentName}")
    public List<Student> findByStudentName(@PathVariable String studentName){
        return studentService.retrieveStudentByName(studentName);
    }

    @GetMapping("/search/{coursePrice}")
    public List<Course> CourseByPrice(@PathVariable Double coursePrice){
        return courseRepository.findByCoursePrice(coursePrice);
    }

}
