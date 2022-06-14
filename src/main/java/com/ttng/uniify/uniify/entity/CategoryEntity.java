package com.ttng.uniify.uniify.entity;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "categories")
    @JsonIgnore
    private List<UniversityEntity> universities = new ArrayList<>();

    public CategoryEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CategoryEntity() {

    }

    public void addUniversity(UniversityEntity university) {
        universities.add(university);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<UniversityEntity> getUniversities() {
        return universities;
    }

    public void setUniversities(List<UniversityEntity> universities) {
        this.universities = universities;
    }
}
