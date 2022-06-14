package com.ttng.uniify.uniify.dto.response;

import com.ttng.uniify.uniify.entity.UniversityEntity;

import java.util.List;

public class UniversityListDto {
    private List<UniversityEntity> universities;

    public List<UniversityEntity> getUniversities() {
        return universities;
    }

    public void setUniversities(List<UniversityEntity> universities) {
        this.universities = universities;
    }
}
