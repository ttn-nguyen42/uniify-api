package com.ttng.uniify.uniify.controller.implementation;

import com.ttng.uniify.uniify.controller.UniversitiesApi;
import com.ttng.uniify.uniify.dto.other.SuccessMessage;
import com.ttng.uniify.uniify.dto.request.CategoryAdditionDto;
import com.ttng.uniify.uniify.dto.request.ProgramCreationDto;
import com.ttng.uniify.uniify.dto.request.UniversityCreationDto;
import com.ttng.uniify.uniify.dto.response.*;
import com.ttng.uniify.uniify.entity.CategoryEntity;
import com.ttng.uniify.uniify.entity.InformationEntity;
import com.ttng.uniify.uniify.entity.ProgramEntity;
import com.ttng.uniify.uniify.entity.UniversityEntity;
import com.ttng.uniify.uniify.service.CategoriesService;
import com.ttng.uniify.uniify.service.CoursesService;
import com.ttng.uniify.uniify.service.UniversitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniversitiesController implements UniversitiesApi {

    private UniversitiesService universitiesService;
    private CoursesService coursesService;
    private CategoriesService categoriesService;

    @Autowired
    public UniversitiesController(UniversitiesService universitiesService, CoursesService coursesService, CategoriesService categoriesService) {
        this.universitiesService = universitiesService;
        this.coursesService = coursesService;
        this.categoriesService = categoriesService;
    }

    @Override
    public ResponseEntity<UniversityListDto> getAllUniversities(String category) {
        List<UniversityEntity> universityEntities = universitiesService.getAllUniversities(category);
        UniversityListDto dto = new UniversityListDto();
        dto.setUniversities(universityEntities);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<UniversityIdDto> addUniversity(UniversityCreationDto newUniversity) {
        UniversityEntity entity = universitiesService.addUniversity(newUniversity);
        UniversityIdDto dto = new UniversityIdDto();
        dto.setUniversityId(entity.getId());
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<UniversityEntity> getUniversityById(String id) {
        UniversityEntity entity = universitiesService.getUniversityById(id);
        return ResponseEntity.ok(entity);
    }

    @Override
    public ResponseEntity<CategoryListDto> getCategoriesById(String id) {
        List<CategoryEntity> entities = universitiesService.getCategoriesById(id);
        CategoryListDto dto = new CategoryListDto();
        dto.setCategories(entities);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<SuccessMessage> addCategoryToUniversityById(String id, CategoryAdditionDto newCategory) {
        Long categoryId = newCategory.getCategoryId();
        universitiesService.addCategoryToUniversityById(id, categoryId);
        return ResponseEntity.ok(new SuccessMessage());
    }

    @Override
    public ResponseEntity<InformationEntity> getInformationById(String id) {
        InformationEntity entity = universitiesService.getInformationById(id);
        return ResponseEntity.ok(entity);
    }

    @Override
    public ResponseEntity<UniversityIdDto> addInformationById(String id) {
        UniversityEntity university = universitiesService.addInformationById(id);
        UniversityIdDto dto = new UniversityIdDto();
        dto.setUniversityId(university.getId());
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<ProgramListDto> getProgramsById(String id) {
        List<ProgramEntity> programs = universitiesService.getProgramsById(id);
        ProgramListDto dto = new ProgramListDto();
        dto.setPrograms(programs);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<ProgramIdDto> addProgramById(String id, ProgramCreationDto newProgram) {
        ProgramEntity program = universitiesService.addProgramById(id, newProgram);
        ProgramIdDto dto = new ProgramIdDto();
        dto.setProgramId(program.getId());
        return ResponseEntity.ok(dto);
    }
}
