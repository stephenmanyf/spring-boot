/**
 * Reference: https://www.mkyong.com/spring-boot/spring-rest-hello-world-example/
 */
package com.stephen.exceptionhandler;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.stephen.exception.BookNotFoundException;
import com.stephen.exception.BookUnSupportedFieldPatchException;

public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    // Let Spring handle the exception, we just override the status code
    @ExceptionHandler(BookNotFoundException.class)
    public void springHandleNotFound(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(BookUnSupportedFieldPatchException.class)
    public void springUnSupportedFieldPatch(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.METHOD_NOT_ALLOWED.value());
    }
}
