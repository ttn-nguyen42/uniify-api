package com.ttng.uniify.uniify.repository;

import com.ttng.uniify.uniify.entity.ProgramEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramsRepository extends CrudRepository<ProgramEntity, Long> {
}
