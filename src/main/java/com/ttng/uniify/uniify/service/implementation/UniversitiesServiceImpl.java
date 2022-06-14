package com.ttng.uniify.uniify.service.implementation;

import com.ttng.uniify.uniify.dto.request.InformationCreationDto;
import com.ttng.uniify.uniify.dto.request.ProgramCreationDto;
import com.ttng.uniify.uniify.dto.request.UniversityCreationDto;
import com.ttng.uniify.uniify.entity.CategoryEntity;
import com.ttng.uniify.uniify.entity.InformationEntity;
import com.ttng.uniify.uniify.entity.ProgramEntity;
import com.ttng.uniify.uniify.entity.UniversityEntity;
import com.ttng.uniify.uniify.exception.ConflictInformationException;
import com.ttng.uniify.uniify.exception.ResourceNotFoundException;
import com.ttng.uniify.uniify.repository.UniversitiesRepository;
import com.ttng.uniify.uniify.service.CategoriesService;
import com.ttng.uniify.uniify.service.UniversitiesService;
import com.ttng.uniify.uniify.utils.Utils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UniversitiesServiceImpl extends Utils implements UniversitiesService {
    private final UniversitiesRepository uRepo;
    private final CategoriesService cService;

    public UniversitiesServiceImpl(UniversitiesRepository uRepo, CategoriesService cService) {
        this.uRepo = uRepo;
        this.cService = cService;
    }

    @Override
    public List<UniversityEntity> getAllUniversities(String categoryId) {
        if (categoryId.isBlank() || categoryId.isEmpty()) {
            return iterableToList(uRepo.findAll());
        }
        CategoryEntity optionalCategory = cService.getCategoryById(categoryId);
        return optionalCategory.getUniversities();
    }

    @Override
    public UniversityEntity addUniversity(UniversityCreationDto university) {
        List<UniversityEntity> universities = getAllUniversities("");
        if (universities.stream()
                        .anyMatch((u) -> Objects.equals(u.getName(), university.getName()) && Objects.equals(u.getCode(), university.getCode()))) {
            throw new ConflictInformationException("University already exists");
        }
        UniversityEntity entity = new UniversityEntity(university.getName(), university.getLocation(), university.getCode());
        return uRepo.save(entity);
    }

    @Override
    public UniversityEntity getUniversityById(String id) {
        Optional<UniversityEntity> university = uRepo.findById(parseId(id));
        return university.orElseThrow(() -> new ResourceNotFoundException("No university found"));
    }

    @Override
    public void addCategoryToUniversityById(String universityId, String categoryId) {
        UniversityEntity university = getUniversityById(universityId);
        if (university.getCategories().stream().anyMatch((c) -> c.getId().equals(parseId(categoryId)))) {
            throw new ConflictInformationException("Category already added");
        }
        CategoryEntity category = cService.getCategoryById(categoryId);
        university.addCategory(category);
        uRepo.save(university);
    }

    @Override
    public InformationEntity getInformationById(String id) {
        UniversityEntity university = getUniversityById(id);
        return university.getInformation();
    }

    @Override
    public UniversityEntity addInformationById(String id, InformationCreationDto info) {
        UniversityEntity university = getUniversityById(id);
        if (university.getInformation() != null) {
            throw new ConflictInformationException("Already assigned information");
        }
        InformationEntity newInfo = new InformationEntity(info.getEmail(), info.getPhoneNumber(), info.getNumberOfStudents(), info.getIntroduction());
        university.setInformation(newInfo);
        return uRepo.save(university);
    }

    @Override
    public List<ProgramEntity> getProgramsById(String id) {
        UniversityEntity university = getUniversityById(id);
        return university.getPrograms();
    }

    @Override
    public ProgramEntity addProgramById(String id, ProgramCreationDto entity) {
        UniversityEntity university = getUniversityById(id);
        if (university.getPrograms().stream().anyMatch((p) -> p.getName().equals(entity.getName()))) {
            throw new ConflictInformationException("Program already exists");
        }
        ProgramEntity program = new ProgramEntity(entity.getName(), entity.getAverageFee());
        university.addProgram(program);
        uRepo.save(university);
        return program;
    }
}
