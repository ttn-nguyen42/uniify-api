package com.ttng.uniify.uniify.service.implementation;

import com.ttng.uniify.uniify.dto.request.CategoryCreationDto;
import com.ttng.uniify.uniify.entity.CategoryEntity;
import com.ttng.uniify.uniify.exception.ConflictInformationException;
import com.ttng.uniify.uniify.exception.ResourceNotFoundException;
import com.ttng.uniify.uniify.repository.CategoriesRepository;
import com.ttng.uniify.uniify.service.CategoriesService;
import com.ttng.uniify.uniify.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CategoriesServiceImpl extends Utils implements CategoriesService {
    private final CategoriesRepository repository;

    @Autowired
    public CategoriesServiceImpl(CategoriesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CategoryEntity> getAllCategories() {
        return iterableToList(repository.findAll());
    }

    @Override
    public CategoryEntity getCategoryById(String id) {
        Optional<CategoryEntity> optionalCategory = repository.findById(parseId(id));
        return optionalCategory.orElseThrow(() -> new ResourceNotFoundException("No category found"));
    }

    @Override
    public CategoryEntity addCategory(CategoryCreationDto category) {
        List<CategoryEntity> categories = getAllCategories();
        if (categories.stream().anyMatch(c -> Objects.equals(c.getName(), category.getName()))) {
            throw new ConflictInformationException("Category already exists");
        }
        CategoryEntity newCategory = new CategoryEntity(category.getName(), category.getDescription());
        return repository.save(newCategory);
    }
}
