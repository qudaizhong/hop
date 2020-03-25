package com.qdz.hop.component;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body,
    		HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<Object>("参数错误...", status);
    }
 
}
