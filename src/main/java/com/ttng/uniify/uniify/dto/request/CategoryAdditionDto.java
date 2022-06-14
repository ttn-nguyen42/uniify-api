package com.ttng.uniify.uniify.dto.request;

import javax.validation.constraints.NotNull;

public class CategoryAdditionDto {
    @NotNull(message = "Category id must not be null")
    private Long categoryId;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
