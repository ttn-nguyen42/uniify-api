package com.ttng.uniify.uniify.dto.request;

import javax.validation.constraints.NotEmpty;

public class UniversityCreationDto {
    @NotEmpty(message = "University name must not be empty")
    private String name;
    private String location;
    @NotEmpty(message = "University code must not be empty")
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
