package com.ttng.uniify.uniify.controller.implementation;

import com.ttng.uniify.uniify.controller.UniversitiesApi;
import com.ttng.uniify.uniify.dto.other.SuccessMessage;
import com.ttng.uniify.uniify.dto.request.CategoryAdditionDto;
import com.ttng.uniify.uniify.dto.request.InformationCreationDto;
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

    private final UniversitiesService service;

    private final CategoriesService cService;

    @Autowired
    public UniversitiesController(UniversitiesService service, CategoriesService cService) {
        this.service = service;
        this.cService = cService;
    }

    @Override
    public ResponseEntity<UniversityListDto> getAllUniversities(String category) {
        List<UniversityEntity> universityEntities = service.getAllUniversities(category);
        UniversityListDto dto = new UniversityListDto();
        dto.setUniversities(universityEntities);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<UniversityIdDto> addUniversity(UniversityCreationDto newUniversity) {
        UniversityEntity entity = service.addUniversity(newUniversity);
        UniversityIdDto dto = new UniversityIdDto();
        dto.setUniversityId(entity.getId());
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<UniversityEntity> getUniversityById(String id) {
        UniversityEntity entity = service.getUniversityById(id);
        return ResponseEntity.ok(entity);
    }

    @Override
    public ResponseEntity<CategoryEntity> getCategoryById(String id) {
        CategoryEntity entity = cService.getCategoryById(id);
        return ResponseEntity.ok(entity);
    }

    @Override
    public ResponseEntity<SuccessMessage> addCategoryToUniversityById(String id, CategoryAdditionDto newCategory) {
        Long categoryId = newCategory.getCategoryId();
        service.addCategoryToUniversityById(id, categoryId.toString());
        return ResponseEntity.ok(new SuccessMessage());
    }

    @Override
    public ResponseEntity<InformationEntity> getInformationById(String id) {
        InformationEntity entity = service.getInformationById(id);
        return ResponseEntity.ok(entity);
    }

    @Override
    public ResponseEntity<UniversityIdDto> addInformationById(String id, InformationCreationDto information) {
        UniversityEntity university = service.addInformationById(id, information);
        UniversityIdDto dto = new UniversityIdDto();
        dto.setUniversityId(university.getId());
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<ProgramListDto> getProgramsById(String id) {
        List<ProgramEntity> programs = service.getProgramsById(id);
        ProgramListDto dto = new ProgramListDto();
        dto.setPrograms(programs);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<ProgramIdDto> addProgramById(String id, ProgramCreationDto newProgram) {
        ProgramEntity program = service.addProgramById(id, newProgram);
        ProgramIdDto dto = new ProgramIdDto();
        dto.setProgramId(program.getId());
        return ResponseEntity.ok(dto);
    }
}
