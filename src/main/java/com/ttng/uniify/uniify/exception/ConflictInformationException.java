package com.ttng.uniify.uniify.exception;

import com.ttng.uniify.uniify.exception.interfaces.ExceptionTemplate;
import org.springframework.http.HttpStatus;

/*
 * For duplicate addition or creation
 */
public class ConflictInformationException extends RuntimeException implements ExceptionTemplate {
    @Override
    public HttpStatus getStatus() {
        return HttpStatus.CONFLICT;
    }

    public ConflictInformationException() {
        super();
    }

    public ConflictInformationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConflictInformationException(String message) {
        super(message);
    }

    public ConflictInformationException(Throwable cause) {
        super(cause);
    }
}
