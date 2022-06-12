package com.ttng.uniify.uniify.repository;

import com.ttng.uniify.uniify.entity.InformationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends CrudRepository<InformationEntity, Long> {
}
