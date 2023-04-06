package com.codin9ninja.jpamanytomany.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "courses")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "courseId")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String title;
    private String abbreviation;
    private Integer modules;
    @Column(name = "coursePrice")
    private Double coursePrice;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private Set<Student> students;
}
