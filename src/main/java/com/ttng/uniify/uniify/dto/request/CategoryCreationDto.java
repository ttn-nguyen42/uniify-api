package com.ttng.uniify.uniify.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CategoryCreationDto {
    @NotEmpty(message = "Incorrect name format")
    private String name;

    @NotNull(message = "Description must not be null")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
