package com.ttng.uniify.uniify.service.implementation;

import com.ttng.uniify.uniify.entity.ProgramEntity;
import com.ttng.uniify.uniify.exception.BadArgumentException;
import com.ttng.uniify.uniify.exception.ResourceNotFoundException;
import com.ttng.uniify.uniify.repository.ProgramsRepository;
import com.ttng.uniify.uniify.service.ProgramsService;
import com.ttng.uniify.uniify.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProgramsServiceImpl extends Utils implements ProgramsService {

    private final ProgramsRepository repository;

    @Autowired
    public ProgramsServiceImpl(ProgramsRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProgramEntity getProgramById(String id) {
        Optional<ProgramEntity> optionalProgram = repository.findById(parseId(id));
        return optionalProgram.orElseThrow(() -> new ResourceNotFoundException("Program not found"));
    }
}
