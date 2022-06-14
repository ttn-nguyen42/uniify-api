package com.ttng.uniify.uniify.service;

import com.ttng.uniify.uniify.dto.request.CategoryCreationDto;
import com.ttng.uniify.uniify.dto.response.CategoryListDto;
import com.ttng.uniify.uniify.entity.CategoryEntity;

import java.util.List;

public interface CategoriesService {
    List<CategoryEntity> getAllCategories();

    CategoryEntity getCategoryById(String id);

    CategoryEntity addCategory(CategoryCreationDto category);
}
