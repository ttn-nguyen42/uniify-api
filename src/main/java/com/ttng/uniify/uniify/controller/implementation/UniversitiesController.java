package com.ttng.uniify.uniify.controller.implementation;

import com.ttng.uniify.uniify.controller.UniversitiesApi;
import com.ttng.uniify.uniify.dto.request.CategoryAdditionDto;
import com.ttng.uniify.uniify.dto.request.ProgramCreationDto;
import com.ttng.uniify.uniify.dto.request.UniversityCreationDto;
import com.ttng.uniify.uniify.dto.response.*;
import com.ttng.uniify.uniify.entity.InformationEntity;
import com.ttng.uniify.uniify.entity.UniversityEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversitiesController implements UniversitiesApi {

    @Override
    public ResponseEntity<UniversityEntity> getAllUniversities(String category) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryIdDto> addUniversity(UniversityCreationDto newUniversity) {
        return null;
    }

    @Override
    public ResponseEntity<UniversityEntity> getUniversityById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryListDto> getCategoriesById(String id) {
        return null;
    }

    @Override
    public void addCategoryToUniversityById(String id, CategoryAdditionDto newCategory) {

    }

    @Override
    public ResponseEntity<InformationEntity> getInformationById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<UniversityIdDto> addInformationById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<ProgramListDto> getProgramsById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<ProgramIdDto> addProgramById(String id, ProgramCreationDto newProgram) {
        return null;
    }
}
