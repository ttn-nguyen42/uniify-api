package com.ttng.uniify.uniify.repository;

import com.ttng.uniify.uniify.entity.UniversityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversitiesRepository extends CrudRepository<UniversityEntity, Long> {
}
