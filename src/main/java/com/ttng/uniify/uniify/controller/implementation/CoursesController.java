package com.ttng.uniify.uniify.controller.implementation;

import com.ttng.uniify.uniify.controller.CoursesApi;
import com.ttng.uniify.uniify.dto.request.CourseCreationDto;
import com.ttng.uniify.uniify.dto.response.CourseIdDto;
import com.ttng.uniify.uniify.dto.response.CourseListDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController implements CoursesApi {
    @Override
    public ResponseEntity<CourseListDto> getCoursesByProgramId(String programId) {
        return null;
    }

    @Override
    public ResponseEntity<CourseIdDto> addCourseByProgramId(String programId, CourseCreationDto newCourse) {
        return null;
    }
}
