package com.ttng.uniify.uniify.controller;

import com.ttng.uniify.uniify.dto.other.SuccessMessage;
import com.ttng.uniify.uniify.dto.request.CategoryAdditionDto;
import com.ttng.uniify.uniify.dto.request.CategoryCreationDto;
import com.ttng.uniify.uniify.dto.request.ProgramCreationDto;
import com.ttng.uniify.uniify.dto.request.UniversityCreationDto;
import com.ttng.uniify.uniify.dto.response.*;
import com.ttng.uniify.uniify.entity.InformationEntity;
import com.ttng.uniify.uniify.entity.UniversityEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api/v1/universities")
public interface UniversitiesApi {
    @GetMapping
    ResponseEntity<UniversityListDto> getAllUniversities(@RequestParam(required = false) String category);

    @PostMapping
    ResponseEntity<UniversityIdDto> addUniversity(@RequestBody UniversityCreationDto newUniversity);

    @GetMapping("/{id}")
    ResponseEntity<UniversityEntity> getUniversityById(@PathVariable String id);

    @GetMapping("/{id}/categories")
    ResponseEntity<CategoryListDto> getCategoriesById(@PathVariable String id);

    @PostMapping("/{id}/categories")
    ResponseEntity<SuccessMessage> addCategoryToUniversityById(@PathVariable String id, @RequestBody @Valid CategoryAdditionDto newCategory);

    @GetMapping("/{id}/information")
    ResponseEntity<InformationEntity> getInformationById(@PathVariable String id);

    @PostMapping("/{id}/information")
    ResponseEntity<UniversityIdDto> addInformationById(@PathVariable String id);

    @GetMapping("/{id}/programs")
    ResponseEntity<ProgramListDto> getProgramsById(@PathVariable String id);

    @PostMapping("/{id}/programs")
    ResponseEntity<ProgramIdDto> addProgramById(@PathVariable String id, @RequestBody @Valid ProgramCreationDto newProgram);
}
