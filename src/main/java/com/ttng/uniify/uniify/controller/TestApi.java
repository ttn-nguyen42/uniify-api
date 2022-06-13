package com.ttng.uniify.uniify.controller;

import com.ttng.uniify.uniify.dto.other.TestMessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/test")
public interface TestApi {
    @GetMapping
    ResponseEntity<TestMessageDto> getTestMessage();
}
