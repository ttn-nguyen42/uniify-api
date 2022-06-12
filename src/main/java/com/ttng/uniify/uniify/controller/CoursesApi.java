package com.ttng.uniify.uniify.controller;

import com.ttng.uniify.uniify.dto.request.CourseCreationDto;
import com.ttng.uniify.uniify.dto.response.CourseIdDto;
import com.ttng.uniify.uniify.dto.response.CourseListDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/courses")
public interface CoursesApi {
    @GetMapping("/{programId}")
    ResponseEntity<CourseListDto> getCoursesByProgramId(@PathVariable String programId);

    @PostMapping("/{programId}")
    ResponseEntity<CourseIdDto> addCourseByProgramId(@PathVariable String programId, @RequestBody CourseCreationDto newCourse);
}
