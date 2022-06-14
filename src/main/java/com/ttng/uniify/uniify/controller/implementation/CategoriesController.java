package com.ttng.uniify.uniify.controller.implementation;

import com.ttng.uniify.uniify.controller.CategoriesApi;
import com.ttng.uniify.uniify.dto.request.CategoryCreationDto;
import com.ttng.uniify.uniify.dto.response.CategoryIdDto;
import com.ttng.uniify.uniify.dto.response.CategoryListDto;
import com.ttng.uniify.uniify.entity.CategoryEntity;
import com.ttng.uniify.uniify.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriesController implements CategoriesApi {
    private final CategoriesService service;

    @Autowired
    public CategoriesController(CategoriesService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<CategoryListDto> getAllCategories() {
        List<CategoryEntity> entities = service.getAllCategories();
        CategoryListDto dto = new CategoryListDto();
        dto.setCategories(entities);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<CategoryIdDto> addCategory(CategoryCreationDto newCategory) {
        CategoryEntity entity = service.addCategory(newCategory);
        CategoryIdDto dto = new CategoryIdDto();
        dto.setCategoryId(entity.getId());
        return ResponseEntity.ok(dto);
    }
}