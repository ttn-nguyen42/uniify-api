package com.ttng.uniify.uniify.service;

import com.ttng.uniify.uniify.dto.request.ProgramCreationDto;
import com.ttng.uniify.uniify.dto.request.UniversityCreationDto;
import com.ttng.uniify.uniify.entity.CategoryEntity;
import com.ttng.uniify.uniify.entity.InformationEntity;
import com.ttng.uniify.uniify.entity.ProgramEntity;
import com.ttng.uniify.uniify.entity.UniversityEntity;

import java.util.List;

public interface UniversitiesService {
    List<UniversityEntity> getAllUniversities(String categoryId);
    UniversityEntity addUniversity(UniversityCreationDto university);

    UniversityEntity getUniversityById(String id);

    List<CategoryEntity> getCategoriesById(String id);

    void addCategoryToUniversityById(String universityId, Long categoryId);

    InformationEntity getInformationById(String id);

    UniversityEntity addInformationById(String id);

    List<ProgramEntity> getProgramsById(String id);

    ProgramEntity addProgramById(String id, ProgramCreationDto entity);
}
