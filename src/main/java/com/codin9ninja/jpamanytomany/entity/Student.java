package com.codin9ninja.jpamanytomany.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private Integer age;
    private String department;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_course",
            joinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "studentId",  insertable = true, updatable = true, nullable=false)
            } ,
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "courseId",  insertable = true, updatable = true, nullable=false)
            }
    )
    private Set<Course> courses;
}
