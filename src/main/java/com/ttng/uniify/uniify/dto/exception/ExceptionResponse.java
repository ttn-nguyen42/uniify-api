package com.ttng.uniify.uniify.dto.exception;

import com.ttng.uniify.uniify.exception.interfaces.ExceptionTemplate;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class ExceptionResponse {
    private String timestamp = "";
    private int status = 500;
    private String error = "";
    private String message = "";
    private String path = "";

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ExceptionResponse(String message, HttpStatus status, HttpServletRequest req, String timestamp) {
        setError(status.getReasonPhrase());
        setMessage(message);
        setPath(req.getRequestURI());
        setStatus(status.value());
        setTimestamp(timestamp);
    }
}
