package com.pagepulse.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.jsoup.HttpStatusException;

import com.pagepulse.backend.dto.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgumentException(IllegalArgumentException e) {

        
        ErrorResponse response = new ErrorResponse(
                "Invalid URL",
                "Please provide a valid URL starting with http:// or https://"
        );

        
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpStatusException.class)
    public ResponseEntity<ErrorResponse> handleHttpStatusException(HttpStatusException e) {

    String error;

    switch (e.getStatusCode()) {

        case 403:
            error = "Access to this website is forbidden.";
            break;

        case 404:
            error = "The requested webpage was not found.";
            break;

        case 500:
            error = "The website encountered an internal server error.";
            break;

        default:
            error = "Website returned HTTP " + e.getStatusCode();
    }

        ErrorResponse response = new ErrorResponse(
            "Website Error",
            error
        );

        return new ResponseEntity<>(response,HttpStatus.valueOf(e.getStatusCode()));
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e) {

        
        ErrorResponse response = new ErrorResponse(
                "Failed",
                e.getMessage()
        );

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
