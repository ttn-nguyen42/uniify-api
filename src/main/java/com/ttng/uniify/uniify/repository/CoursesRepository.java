package com.ttng.uniify.uniify.repository;

import com.ttng.uniify.uniify.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<CourseEntity, Long> {
}
