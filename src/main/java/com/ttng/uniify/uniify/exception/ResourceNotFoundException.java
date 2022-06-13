package com.ttng.uniify.uniify.exception;

import com.ttng.uniify.uniify.exception.interfaces.ExceptionTemplate;
import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends RuntimeException implements ExceptionTemplate {
    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }

    public ResourceNotFoundException() {
        super();
    }
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public ResourceNotFoundException(String message) {
        super(message);
    }
    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }
}
