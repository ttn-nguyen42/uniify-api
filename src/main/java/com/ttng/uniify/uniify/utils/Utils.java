package com.ttng.uniify.uniify.utils;

import com.ttng.uniify.uniify.dto.exception.ExceptionResponse;
import com.ttng.uniify.uniify.exception.BadArgumentException;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

public class Utils {
    public static String getTimestamp() {
        Instant now = Clock.systemUTC().instant();
        Date d = Date.from(now);
        return d.toString();
    }

    public static ExceptionResponse exceptionResponseBuilder(String message, HttpStatus status, HttpServletRequest req) {
        return new ExceptionResponse(message, status, req, getTimestamp());
    }

    public static <T> List<T> iterableToList(Iterable<T> it) {
        return StreamSupport.stream(it.spliterator(), false).toList();
    }

    public static Long parseId(String id) {
        try {
            return Long.parseLong(id);
        } catch (NumberFormatException e) {
            throw new BadArgumentException("Id is not a Long");
        }
    }
}
