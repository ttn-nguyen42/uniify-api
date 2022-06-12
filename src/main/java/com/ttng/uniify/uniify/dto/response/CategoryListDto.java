package com.ttng.uniify.uniify.dto.response;

import com.ttng.uniify.uniify.entity.CategoryEntity;

import java.util.List;

public class CategoryListDto {
    private List<CategoryEntity> categories;

    public List<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryEntity> categories) {
        this.categories = categories;
    }
}
