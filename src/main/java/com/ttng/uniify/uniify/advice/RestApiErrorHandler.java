package com.ttng.uniify.uniify.advice;

import com.ttng.uniify.uniify.dto.exception.ExceptionResponse;
import com.ttng.uniify.uniify.exception.BadArgumentException;
import com.ttng.uniify.uniify.exception.ConflictInformationException;
import com.ttng.uniify.uniify.exception.ResourceNotFoundException;
import com.ttng.uniify.uniify.exception.interfaces.ExceptionTemplate;
import com.ttng.uniify.uniify.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.ElementCollection;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@ControllerAdvice
public class RestApiErrorHandler extends Utils {
    private static final Logger log = LoggerFactory.getLogger(RestApiErrorHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleGeneralException(Exception e, HttpServletRequest req) {
        ExceptionResponse res = exceptionResponseBuilder(e, HttpStatus.INTERNAL_SERVER_ERROR, req);
        return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BadArgumentException.class)
    public ResponseEntity<ExceptionResponse> handleBadArgumentException(BadArgumentException e, HttpServletRequest req) {
        ExceptionResponse res = exceptionResponseBuilder(e, e.getStatus(), req);
        return new ResponseEntity<>(res, e.getStatus());
    }

    @ExceptionHandler(ConflictInformationException.class)
    public ResponseEntity<ExceptionResponse> handleConflictException(ConflictInformationException e, HttpServletRequest req) {
        ExceptionResponse res = exceptionResponseBuilder(e, e.getStatus(), req);
        return new ResponseEntity<>(res, e.getStatus());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleResourceException(ResourceNotFoundException e, HttpServletRequest req) {
        ExceptionResponse res = exceptionResponseBuilder(e, e.getStatus(), req);
        return new ResponseEntity<>(res, e.getStatus());
    }
}
