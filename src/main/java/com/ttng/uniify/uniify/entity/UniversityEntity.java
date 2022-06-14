package com.ttng.uniify.uniify.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "university")
public class UniversityEntity {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "code")
    private String code;

    // (JoinColumn) Holds the foreign key
    // Removing a university must also remove its information
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private InformationEntity information;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "university_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<CategoryEntity> categories = new ArrayList<>();

    // Removing a university must also remove all of its programs
    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
    private List<ProgramEntity> programs = new ArrayList<>();

    public UniversityEntity(String name, String location, String code) {
        this.name = name;
        this.location = location;
        this.code = code;
    }

    public UniversityEntity() {

    }

    public void addProgram(ProgramEntity program) {
        this.programs.add(program);
    }

    public void addCategory(CategoryEntity category) {
        this.categories.add(category);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public InformationEntity getInformation() {
        return information;
    }

    public void setInformation(InformationEntity information) {
        this.information = information;
    }

    public List<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryEntity> categories) {
        this.categories = categories;
    }

    public List<ProgramEntity> getPrograms() {
        return programs;
    }

    public void setPrograms(List<ProgramEntity> programs) {
        this.programs = programs;
    }
}
