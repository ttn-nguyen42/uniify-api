package com.ttng.uniify.uniify.service.implementation;

import com.ttng.uniify.uniify.dto.request.ProgramCreationDto;
import com.ttng.uniify.uniify.dto.request.UniversityCreationDto;
import com.ttng.uniify.uniify.entity.CategoryEntity;
import com.ttng.uniify.uniify.entity.InformationEntity;
import com.ttng.uniify.uniify.entity.ProgramEntity;
import com.ttng.uniify.uniify.entity.UniversityEntity;
import com.ttng.uniify.uniify.service.UniversitiesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversitiesServiceImpl implements UniversitiesService {
    @Override
    public List<UniversityEntity> getAllUniversities(String categoryId) {
        return null;
    }

    @Override
    public UniversityEntity addUniversity(UniversityCreationDto university) {
        return null;
    }

    @Override
    public UniversityEntity getUniversityById(String id) {
        return null;
    }

    @Override
    public List<CategoryEntity> getCategoriesById(String id) {
        return null;
    }

    @Override
    public void addCategoryToUniversityById(String universityId, Long categoryId) {

    }

    @Override
    public InformationEntity getInformationById(String id) {
        return null;
    }

    @Override
    public UniversityEntity addInformationById(String id) {
        return null;
    }

    @Override
    public List<ProgramEntity> getProgramsById(String id) {
        return null;
    }

    @Override
    public ProgramEntity addProgramById(String id, ProgramCreationDto entity) {
        return null;
    }
}
