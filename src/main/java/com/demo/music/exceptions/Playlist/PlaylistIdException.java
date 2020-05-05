package com.demo.music.exceptions.Playlist;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PlaylistIdException extends RuntimeException {
    public PlaylistIdException(String message){
        super(message);
    };
}
