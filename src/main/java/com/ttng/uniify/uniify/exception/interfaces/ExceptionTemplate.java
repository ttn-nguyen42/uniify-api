package com.ttng.uniify.uniify.exception.interfaces;

import org.springframework.http.HttpStatus;

public interface ExceptionTemplate {
    HttpStatus getStatus();
}
