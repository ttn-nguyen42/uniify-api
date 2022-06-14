package com.ttng.uniify.uniify.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CourseCreationDto {
    @NotEmpty(message = "Course name must not be empty")
    private String name;
    @NotNull(message = "Description must not be null")
    private String description;

    private Float averageScore;

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

    public Float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Float averageScore) {
        this.averageScore = averageScore;
    }
}
