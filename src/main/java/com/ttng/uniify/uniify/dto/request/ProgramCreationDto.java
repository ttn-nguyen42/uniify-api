package com.ttng.uniify.uniify.dto.request;

import javax.validation.constraints.NotEmpty;

public class ProgramCreationDto {
    @NotEmpty(message = "Program name must not be empty")
    private String name;

    private Float averageFee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAverageFee() {
        return averageFee;
    }

    public void setAverageFee(Float averageFee) {
        this.averageFee = averageFee;
    }
}
