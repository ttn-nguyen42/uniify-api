package com.ttng.uniify.uniify.controller.implementation;

import com.ttng.uniify.uniify.controller.TestApi;
import com.ttng.uniify.uniify.dto.other.TestMessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestApi {
    @Override
    public ResponseEntity<TestMessageDto> getTestMessage() {
        TestMessageDto response = new TestMessageDto();
        response.setMessage("REST API running normally");
        return ResponseEntity.ok(response);
    }
}
