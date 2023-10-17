package br.com.taritaleite.todolist.errors;

import org.apache.coyote.Response;
import org.aspectj.weaver.ResolvedPointcutDefinition;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//Controller para tratamento global de exceções
@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler (HttpMessageNotReadableException.class)
    public ResponseEntity<String> handHttpMessageNotReadbleException (HttpMessageNotReadableException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMostSpecificCause().getMessage());
    }
}
