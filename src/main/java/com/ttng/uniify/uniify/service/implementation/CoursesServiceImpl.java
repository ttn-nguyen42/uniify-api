package com.ttng.uniify.uniify.service.implementation;

import com.ttng.uniify.uniify.dto.request.CourseCreationDto;
import com.ttng.uniify.uniify.entity.CourseEntity;
import com.ttng.uniify.uniify.entity.ProgramEntity;
import com.ttng.uniify.uniify.exception.BadArgumentException;
import com.ttng.uniify.uniify.exception.ConflictInformationException;
import com.ttng.uniify.uniify.exception.ResourceNotFoundException;
import com.ttng.uniify.uniify.repository.CoursesRepository;
import com.ttng.uniify.uniify.repository.ProgramsRepository;
import com.ttng.uniify.uniify.service.CoursesService;
import com.ttng.uniify.uniify.service.ProgramsService;
import com.ttng.uniify.uniify.utils.Utils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CoursesServiceImpl extends Utils implements CoursesService {
    private final ProgramsRepository pRepo;

    private final ProgramsService programsService;

    public CoursesServiceImpl(ProgramsRepository pRepo, ProgramsService programsService) {
        this.pRepo = pRepo;
        this.programsService = programsService;
    }

    @Override
    public List<CourseEntity> getCoursesByProgramId(String id) {
        ProgramEntity program = programsService.getProgramById(id);
        return program.getCourses();
    }

    @Override
    public CourseEntity addCourseByProgramId(String id, CourseCreationDto entity) {
        ProgramEntity program = programsService.getProgramById(id);
        if (program.getCourses()
                   .stream()
                   .anyMatch((c) -> c.getName().equals(entity.getName()) && c.getDescription()
                                                                             .equals(entity.getDescription()))) {
            throw new ConflictInformationException("Course already exists");
        }
        CourseEntity course = new CourseEntity(entity.getName(), entity.getDescription(), entity.getAverageScore());
        program.addCourse(course);
        pRepo.save(program);
        return course;
    }
}
