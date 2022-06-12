package com.ttng.uniify.uniify.dto.response;

import com.ttng.uniify.uniify.entity.ProgramEntity;

import java.util.List;

public class ProgramListDto {
    private List<ProgramEntity> programs;

    public List<ProgramEntity> getPrograms() {
        return programs;
    }

    public void setPrograms(List<ProgramEntity> programs) {
        this.programs = programs;
    }
}
