package com.demo.music.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseException extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public final ResponseEntity<Object> handleArtistIdException(ArtistIdException e) {
        return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public final ResponseEntity<Object> handleArtistNotFoundException(ArtistNotFoundException ex, WebRequest webRequest){

        ArtistNotFoundException artistNotFoundException = new ArtistNotFoundException(ex.getMessage());

        return new ResponseEntity(artistNotFoundException, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler
    public final ResponseEntity<Object> handleAlbumIdException(AlbumIdException e) {
        return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler
    public final ResponseEntity<Object> handleAlbumNotFoundException(AlbumNotFoundException ex, WebRequest webRequest){

        AlbumNotFoundException albumNotFoundException = new AlbumNotFoundException(ex.getMessage());

        return new ResponseEntity(albumNotFoundException, HttpStatus.BAD_REQUEST);
    }


}
