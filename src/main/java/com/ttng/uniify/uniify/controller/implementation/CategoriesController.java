package com.ttng.uniify.uniify.controller.implementation;

import com.ttng.uniify.uniify.controller.CategoriesApi;
import com.ttng.uniify.uniify.dto.request.CategoryCreationDto;
import com.ttng.uniify.uniify.dto.response.CategoryIdDto;
import com.ttng.uniify.uniify.dto.response.CategoryListDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController implements CategoriesApi {
    @Override
    public ResponseEntity<CategoryListDto> getAllCategories() {
        return null;
    }

    @Override
    public ResponseEntity<CategoryIdDto> addCategory(CategoryCreationDto newCategory) {
        return null;
    }
}