package com.demo.music.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TrackIdException extends RuntimeException {
    public TrackIdException(String message){
        super(message);
    }
}
