package com.ttng.uniify.uniify.service.implementation;

import com.ttng.uniify.uniify.dto.request.CategoryCreationDto;
import com.ttng.uniify.uniify.entity.CategoryEntity;
import com.ttng.uniify.uniify.service.CategoriesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Override
    public List<CategoryEntity> getAllCategories() {
        return null;
    }

    @Override
    public CategoryEntity addCategory(CategoryCreationDto category) {
        return null;
    }
}
