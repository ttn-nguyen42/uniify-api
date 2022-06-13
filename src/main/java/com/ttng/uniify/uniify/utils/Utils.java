package com.ttng.uniify.uniify.utils;

import com.ttng.uniify.uniify.dto.exception.ExceptionResponse;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Utils {
    public static String getTimestamp() {
        Instant now = Clock.systemUTC().instant();
        Date d = Date.from(now);
        return d.toString();
    }

    public static ExceptionResponse exceptionResponseBuilder(Exception e, HttpStatus status, HttpServletRequest req) {
        return new ExceptionResponse(e, status, req, getTimestamp());
    }
}
