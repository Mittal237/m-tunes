package com.demo.music.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AlbumNotFoundException extends RuntimeException{
    public AlbumNotFoundException(String message) {
        super(message);
    }
}
