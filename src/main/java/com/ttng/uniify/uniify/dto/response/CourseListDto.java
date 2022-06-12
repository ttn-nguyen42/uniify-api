package com.ttng.uniify.uniify.dto.response;

import com.ttng.uniify.uniify.entity.CourseEntity;

import java.util.List;

public class CourseListDto {
    private List<CourseEntity> courses;

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }
}
