package com.ttng.uniify.uniify.dto.request;

public class ProgramCreationDto {
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
