package com.ttng.uniify.uniify.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class InformationCreationDto {
    @NotEmpty(message = "Email must not be empty")
    private String email;
    private String phoneNumber;
    private Long numberOfStudents;
    private String introduction;

    public InformationCreationDto(String email, String phoneNumber, Long numberOfStudents, String introduction) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.numberOfStudents = numberOfStudents;
        this.introduction = introduction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Long numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
