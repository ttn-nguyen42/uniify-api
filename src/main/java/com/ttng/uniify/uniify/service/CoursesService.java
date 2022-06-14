package com.ttng.uniify.uniify.service;

import com.ttng.uniify.uniify.dto.request.CourseCreationDto;
import com.ttng.uniify.uniify.entity.CourseEntity;

import java.util.List;

public interface CoursesService {
    List<CourseEntity> getCoursesByProgramId(String id);
    CourseEntity addCourseByProgramId(String id, CourseCreationDto entity);
}
