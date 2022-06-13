package com.ttng.uniify.uniify.exception;

import com.ttng.uniify.uniify.exception.interfaces.ExceptionTemplate;
import org.springframework.http.HttpStatus;

/*
 * For requests with incorrect DTO type or missing information
 */
public class BadArgumentException extends RuntimeException implements ExceptionTemplate {
    @Override
    public HttpStatus getStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    public BadArgumentException() {
        super();
    }

    public BadArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadArgumentException(String message) {
        super(message);
    }

    public BadArgumentException(Throwable cause) {
        super(cause);
    }
}
