package com.ttng.uniify.uniify.controller.implementation;

import com.ttng.uniify.uniify.controller.CoursesApi;
import com.ttng.uniify.uniify.dto.request.CourseCreationDto;
import com.ttng.uniify.uniify.dto.response.CourseIdDto;
import com.ttng.uniify.uniify.dto.response.CourseListDto;
import com.ttng.uniify.uniify.entity.CourseEntity;
import com.ttng.uniify.uniify.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController implements CoursesApi {

    private CoursesService service;

    @Autowired
    public CoursesController(CoursesService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<CourseListDto> getCoursesByProgramId(String programId) {
        List<CourseEntity> entities = service.getCoursesByProgramId(programId);
        CourseListDto dto = new CourseListDto();
        dto.setCourses(entities);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<CourseIdDto> addCourseByProgramId(String programId, CourseCreationDto newCourse) {
        CourseEntity entity = service.addCourseByProgramId(programId, newCourse);
        CourseIdDto dto = new CourseIdDto();
        dto.setCourseId(entity.getId());
        return ResponseEntity.ok(dto);
    }
}
