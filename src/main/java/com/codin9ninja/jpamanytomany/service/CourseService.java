package com.codin9ninja.jpamanytomany.service;

import com.codin9ninja.jpamanytomany.entity.Course;
import com.codin9ninja.jpamanytomany.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public List<Course> sortByCoursePrice(Double coursePrice){
        return courseRepository.findByCoursePrice(coursePrice);
    }
}
