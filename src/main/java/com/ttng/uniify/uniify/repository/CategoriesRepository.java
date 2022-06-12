package com.ttng.uniify.uniify.repository;

import com.ttng.uniify.uniify.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends CrudRepository<CategoryEntity, Long> {
}
