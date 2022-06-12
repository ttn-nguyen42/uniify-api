package com.ttng.uniify.uniify.controller;

import com.ttng.uniify.uniify.dto.request.CategoryCreationDto;
import com.ttng.uniify.uniify.dto.response.CategoryIdDto;
import com.ttng.uniify.uniify.dto.response.CategoryListDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/categories")
public interface CategoriesApi {
    @GetMapping
    ResponseEntity<CategoryListDto> getAllCategories();

    @PostMapping
    ResponseEntity<CategoryIdDto> addCategory(@RequestBody CategoryCreationDto newCategory);
}
