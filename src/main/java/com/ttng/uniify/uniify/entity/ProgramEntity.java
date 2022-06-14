package com.ttng.uniify.uniify.entity;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "program")
public class ProgramEntity {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "average_fee")
    private Float averageFee;

    // Removing a program must also remove the courses
    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL)
    private List<CourseEntity> courses = new ArrayList<>();

    // (JoinColumn) Holds the foreign key
    // Removing the program must not remove also the university
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(nullable = false)
    @JsonIgnore
    private UniversityEntity university;

    public ProgramEntity(String name, Float averageFee) {
        this.name = name;
        this.averageFee = averageFee;
    }

    public void addCourse(CourseEntity course) {
        this.courses.add(course);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAverageFee() {
        return averageFee;
    }

    public void setAverageFee(Float averageFee) {
        this.averageFee = averageFee;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    public UniversityEntity getUniversity() {
        return university;
    }

    public void setUniversity(UniversityEntity university) {
        this.university = university;
    }

}
