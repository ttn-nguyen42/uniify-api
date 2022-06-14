package com.ttng.uniify.uniify.service.implementation;

import com.ttng.uniify.uniify.dto.request.CourseCreationDto;
import com.ttng.uniify.uniify.entity.CourseEntity;
import com.ttng.uniify.uniify.service.CoursesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {
    @Override
    public List<CourseEntity> getCoursesByProgramId(String id) {
        return null;
    }

    @Override
    public CourseEntity addCourseByProgramId(String id, CourseCreationDto entity) {
        return null;
    }
}
