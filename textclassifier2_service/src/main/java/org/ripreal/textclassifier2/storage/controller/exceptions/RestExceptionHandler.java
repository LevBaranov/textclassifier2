package org.ripreal.textclassifier2.storage.controller.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ThereIsNoSuchCharacteristic.class)
    protected ResponseEntity<WebControllerException> handleThereIsNoSuchCharacteristicException() {
        return new ResponseEntity<>(new WebControllerException("There is no such characteristic"), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IncorrectClassifierType.class)
    protected ResponseEntity<WebControllerException> handleIncorrectClassifierTypeException() {
        return new ResponseEntity<>(new WebControllerException("Illegal argument \"classifierType\" in options parameters"), HttpStatus.BAD_REQUEST);
    }

    @Data
    @AllArgsConstructor
    private static class WebControllerException {
        private String message;
    }
}
